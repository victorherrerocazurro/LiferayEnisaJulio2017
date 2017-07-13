package com.example.plugins.service.persistence;

import com.example.plugins.NoSuchSubastaException;
import com.example.plugins.model.Subasta;
import com.example.plugins.model.impl.SubastaImpl;
import com.example.plugins.model.impl.SubastaModelImpl;
import com.example.plugins.service.persistence.SubastaPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the subasta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistence
 * @see SubastaUtil
 * @generated
 */
public class SubastaPersistenceImpl extends BasePersistenceImpl<Subasta>
    implements SubastaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SubastaUtil} to access the subasta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SubastaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            SubastaModelImpl.UUID_COLUMN_BITMASK |
            SubastaModelImpl.PRECIOMINIMO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "subasta.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "subasta.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(subasta.uuid IS NULL OR subasta.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            SubastaModelImpl.UUID_COLUMN_BITMASK |
            SubastaModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "subasta.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "subasta.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(subasta.uuid IS NULL OR subasta.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "subasta.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            SubastaModelImpl.UUID_COLUMN_BITMASK |
            SubastaModelImpl.COMPANYID_COLUMN_BITMASK |
            SubastaModelImpl.PRECIOMINIMO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "subasta.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "subasta.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(subasta.uuid IS NULL OR subasta.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "subasta.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FECHAINICIO_FECHAFIN =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, SubastaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByFechaInicio_FechaFin",
            new String[] {
                Date.class.getName(), Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_FECHAINICIO_FECHAFIN =
        new FinderPath(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "countByFechaInicio_FechaFin",
            new String[] { Date.class.getName(), Date.class.getName() });
    private static final String _FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_1 =
        "subasta.fechaInicio >= NULL AND ";
    private static final String _FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_2 =
        "subasta.fechaInicio >= ? AND ";
    private static final String _FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_1 = "subasta.fechaFin <= NULL";
    private static final String _FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_2 = "subasta.fechaFin <= ?";
    private static final String _SQL_SELECT_SUBASTA = "SELECT subasta FROM Subasta subasta";
    private static final String _SQL_SELECT_SUBASTA_WHERE = "SELECT subasta FROM Subasta subasta WHERE ";
    private static final String _SQL_COUNT_SUBASTA = "SELECT COUNT(subasta) FROM Subasta subasta";
    private static final String _SQL_COUNT_SUBASTA_WHERE = "SELECT COUNT(subasta) FROM Subasta subasta WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "subasta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Subasta exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Subasta exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SubastaPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Subasta _nullSubasta = new SubastaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Subasta> toCacheModel() {
                return _nullSubastaCacheModel;
            }
        };

    private static CacheModel<Subasta> _nullSubastaCacheModel = new CacheModel<Subasta>() {
            @Override
            public Subasta toEntityModel() {
                return _nullSubasta;
            }
        };

    public SubastaPersistenceImpl() {
        setModelClass(Subasta.class);
    }

    /**
     * Returns all the subastas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the subastas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @return the range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the subastas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if (!Validator.equals(uuid, subasta.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first subasta in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByUuid_First(uuid, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last subasta in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByUuid_Last(uuid, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the subastas before and after the current subasta in the ordered set where uuid = &#63;.
     *
     * @param subastaId the primary key of the current subasta
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next subasta
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta[] findByUuid_PrevAndNext(long subastaId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(subastaId);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByUuid_PrevAndNext(session, subasta, uuid,
                    orderByComparator, true);

            array[1] = subasta;

            array[2] = getByUuid_PrevAndNext(session, subasta, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByUuid_PrevAndNext(Session session, Subasta subasta,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Subasta subasta : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the subasta where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByUUID_G(String uuid, long groupId)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByUUID_G(uuid, groupId);

        if (subasta == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchSubastaException(msg.toString());
        }

        return subasta;
    }

    /**
     * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Subasta) {
            Subasta subasta = (Subasta) result;

            if (!Validator.equals(uuid, subasta.getUuid()) ||
                    (groupId != subasta.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Subasta> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Subasta subasta = list.get(0);

                    result = subasta;

                    cacheResult(subasta);

                    if ((subasta.getUuid() == null) ||
                            !subasta.getUuid().equals(uuid) ||
                            (subasta.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, subasta);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Subasta) result;
        }
    }

    /**
     * Removes the subasta where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the subasta that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta removeByUUID_G(String uuid, long groupId)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByUUID_G(uuid, groupId);

        return remove(subasta);
    }

    /**
     * Returns the number of subastas where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the subastas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @return the range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the subastas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByUuid_C(String uuid, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if (!Validator.equals(uuid, subasta.getUuid()) ||
                        (companyId != subasta.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first subasta in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Subasta> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last subasta in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the subastas before and after the current subasta in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param subastaId the primary key of the current subasta
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next subasta
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta[] findByUuid_C_PrevAndNext(long subastaId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(subastaId);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, subasta, uuid,
                    companyId, orderByComparator, true);

            array[1] = subasta;

            array[2] = getByUuid_C_PrevAndNext(session, subasta, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByUuid_C_PrevAndNext(Session session, Subasta subasta,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Subasta subasta : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @return the matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByFechaInicio_FechaFin(Date fechaInicio,
        Date fechaFin) throws SystemException {
        return findByFechaInicio_FechaFin(fechaInicio, fechaFin,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @return the range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByFechaInicio_FechaFin(Date fechaInicio,
        Date fechaFin, int start, int end) throws SystemException {
        return findByFechaInicio_FechaFin(fechaInicio, fechaFin, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findByFechaInicio_FechaFin(Date fechaInicio,
        Date fechaFin, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FECHAINICIO_FECHAFIN;
        finderArgs = new Object[] {
                fechaInicio, fechaFin,
                
                start, end, orderByComparator
            };

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Subasta subasta : list) {
                if ((fechaInicio.getTime() > subasta.getFechaInicio().getTime()) ||
                        (fechaFin.getTime() < subasta.getFechaFin().getTime())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SUBASTA_WHERE);

            boolean bindFechaInicio = false;

            if (fechaInicio == null) {
                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_1);
            } else {
                bindFechaInicio = true;

                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_2);
            }

            boolean bindFechaFin = false;

            if (fechaFin == null) {
                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_1);
            } else {
                bindFechaFin = true;

                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SubastaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFechaInicio) {
                    qPos.add(CalendarUtil.getTimestamp(fechaInicio));
                }

                if (bindFechaFin) {
                    qPos.add(CalendarUtil.getTimestamp(fechaFin));
                }

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByFechaInicio_FechaFin_First(Date fechaInicio,
        Date fechaFin, OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByFechaInicio_FechaFin_First(fechaInicio,
                fechaFin, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("fechaInicio=");
        msg.append(fechaInicio);

        msg.append(", fechaFin=");
        msg.append(fechaFin);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the first subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByFechaInicio_FechaFin_First(Date fechaInicio,
        Date fechaFin, OrderByComparator orderByComparator)
        throws SystemException {
        List<Subasta> list = findByFechaInicio_FechaFin(fechaInicio, fechaFin,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta
     * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByFechaInicio_FechaFin_Last(Date fechaInicio,
        Date fechaFin, OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByFechaInicio_FechaFin_Last(fechaInicio,
                fechaFin, orderByComparator);

        if (subasta != null) {
            return subasta;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("fechaInicio=");
        msg.append(fechaInicio);

        msg.append(", fechaFin=");
        msg.append(fechaFin);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSubastaException(msg.toString());
    }

    /**
     * Returns the last subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByFechaInicio_FechaFin_Last(Date fechaInicio,
        Date fechaFin, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByFechaInicio_FechaFin(fechaInicio, fechaFin);

        if (count == 0) {
            return null;
        }

        List<Subasta> list = findByFechaInicio_FechaFin(fechaInicio, fechaFin,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the subastas before and after the current subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param subastaId the primary key of the current subasta
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next subasta
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta[] findByFechaInicio_FechaFin_PrevAndNext(long subastaId,
        Date fechaInicio, Date fechaFin, OrderByComparator orderByComparator)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = findByPrimaryKey(subastaId);

        Session session = null;

        try {
            session = openSession();

            Subasta[] array = new SubastaImpl[3];

            array[0] = getByFechaInicio_FechaFin_PrevAndNext(session, subasta,
                    fechaInicio, fechaFin, orderByComparator, true);

            array[1] = subasta;

            array[2] = getByFechaInicio_FechaFin_PrevAndNext(session, subasta,
                    fechaInicio, fechaFin, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Subasta getByFechaInicio_FechaFin_PrevAndNext(Session session,
        Subasta subasta, Date fechaInicio, Date fechaFin,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SUBASTA_WHERE);

        boolean bindFechaInicio = false;

        if (fechaInicio == null) {
            query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_1);
        } else {
            bindFechaInicio = true;

            query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_2);
        }

        boolean bindFechaFin = false;

        if (fechaFin == null) {
            query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_1);
        } else {
            bindFechaFin = true;

            query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SubastaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindFechaInicio) {
            qPos.add(CalendarUtil.getTimestamp(fechaInicio));
        }

        if (bindFechaFin) {
            qPos.add(CalendarUtil.getTimestamp(fechaFin));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(subasta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Subasta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63; from the database.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByFechaInicio_FechaFin(Date fechaInicio, Date fechaFin)
        throws SystemException {
        for (Subasta subasta : findByFechaInicio_FechaFin(fechaInicio,
                fechaFin, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
     *
     * @param fechaInicio the fecha inicio
     * @param fechaFin the fecha fin
     * @return the number of matching subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFechaInicio_FechaFin(Date fechaInicio, Date fechaFin)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_FECHAINICIO_FECHAFIN;

        Object[] finderArgs = new Object[] { fechaInicio, fechaFin };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SUBASTA_WHERE);

            boolean bindFechaInicio = false;

            if (fechaInicio == null) {
                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_1);
            } else {
                bindFechaInicio = true;

                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAINICIO_2);
            }

            boolean bindFechaFin = false;

            if (fechaFin == null) {
                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_1);
            } else {
                bindFechaFin = true;

                query.append(_FINDER_COLUMN_FECHAINICIO_FECHAFIN_FECHAFIN_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFechaInicio) {
                    qPos.add(CalendarUtil.getTimestamp(fechaInicio));
                }

                if (bindFechaFin) {
                    qPos.add(CalendarUtil.getTimestamp(fechaFin));
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the subasta in the entity cache if it is enabled.
     *
     * @param subasta the subasta
     */
    @Override
    public void cacheResult(Subasta subasta) {
        EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey(), subasta);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { subasta.getUuid(), subasta.getGroupId() }, subasta);

        subasta.resetOriginalValues();
    }

    /**
     * Caches the subastas in the entity cache if it is enabled.
     *
     * @param subastas the subastas
     */
    @Override
    public void cacheResult(List<Subasta> subastas) {
        for (Subasta subasta : subastas) {
            if (EntityCacheUtil.getResult(
                        SubastaModelImpl.ENTITY_CACHE_ENABLED,
                        SubastaImpl.class, subasta.getPrimaryKey()) == null) {
                cacheResult(subasta);
            } else {
                subasta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all subastas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SubastaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SubastaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the subasta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Subasta subasta) {
        EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(subasta);
    }

    @Override
    public void clearCache(List<Subasta> subastas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Subasta subasta : subastas) {
            EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                SubastaImpl.class, subasta.getPrimaryKey());

            clearUniqueFindersCache(subasta);
        }
    }

    protected void cacheUniqueFindersCache(Subasta subasta) {
        if (subasta.isNew()) {
            Object[] args = new Object[] { subasta.getUuid(), subasta.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, subasta);
        } else {
            SubastaModelImpl subastaModelImpl = (SubastaModelImpl) subasta;

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subasta.getUuid(), subasta.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    subasta);
            }
        }
    }

    protected void clearUniqueFindersCache(Subasta subasta) {
        SubastaModelImpl subastaModelImpl = (SubastaModelImpl) subasta;

        Object[] args = new Object[] { subasta.getUuid(), subasta.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((subastaModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    subastaModelImpl.getOriginalUuid(),
                    subastaModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new subasta with the primary key. Does not add the subasta to the database.
     *
     * @param subastaId the primary key for the new subasta
     * @return the new subasta
     */
    @Override
    public Subasta create(long subastaId) {
        Subasta subasta = new SubastaImpl();

        subasta.setNew(true);
        subasta.setPrimaryKey(subastaId);

        String uuid = PortalUUIDUtil.generate();

        subasta.setUuid(uuid);

        return subasta;
    }

    /**
     * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param subastaId the primary key of the subasta
     * @return the subasta that was removed
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta remove(long subastaId)
        throws NoSuchSubastaException, SystemException {
        return remove((Serializable) subastaId);
    }

    /**
     * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta that was removed
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta remove(Serializable primaryKey)
        throws NoSuchSubastaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Subasta subasta = (Subasta) session.get(SubastaImpl.class,
                    primaryKey);

            if (subasta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSubastaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(subasta);
        } catch (NoSuchSubastaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Subasta removeImpl(Subasta subasta) throws SystemException {
        subasta = toUnwrappedModel(subasta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(subasta)) {
                subasta = (Subasta) session.get(SubastaImpl.class,
                        subasta.getPrimaryKeyObj());
            }

            if (subasta != null) {
                session.delete(subasta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (subasta != null) {
            clearCache(subasta);
        }

        return subasta;
    }

    @Override
    public Subasta updateImpl(com.example.plugins.model.Subasta subasta)
        throws SystemException {
        subasta = toUnwrappedModel(subasta);

        boolean isNew = subasta.isNew();

        SubastaModelImpl subastaModelImpl = (SubastaModelImpl) subasta;

        if (Validator.isNull(subasta.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            subasta.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (subasta.isNew()) {
                session.save(subasta);

                subasta.setNew(false);
            } else {
                session.merge(subasta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SubastaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { subastaModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { subastaModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((subastaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        subastaModelImpl.getOriginalUuid(),
                        subastaModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        subastaModelImpl.getUuid(),
                        subastaModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }
        }

        EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
            SubastaImpl.class, subasta.getPrimaryKey(), subasta);

        clearUniqueFindersCache(subasta);
        cacheUniqueFindersCache(subasta);

        return subasta;
    }

    protected Subasta toUnwrappedModel(Subasta subasta) {
        if (subasta instanceof SubastaImpl) {
            return subasta;
        }

        SubastaImpl subastaImpl = new SubastaImpl();

        subastaImpl.setNew(subasta.isNew());
        subastaImpl.setPrimaryKey(subasta.getPrimaryKey());

        subastaImpl.setUuid(subasta.getUuid());
        subastaImpl.setSubastaId(subasta.getSubastaId());
        subastaImpl.setGroupId(subasta.getGroupId());
        subastaImpl.setCompanyId(subasta.getCompanyId());
        subastaImpl.setUserId(subasta.getUserId());
        subastaImpl.setUserName(subasta.getUserName());
        subastaImpl.setCreateDate(subasta.getCreateDate());
        subastaImpl.setModifiedDate(subasta.getModifiedDate());
        subastaImpl.setPrecioMinimo(subasta.getPrecioMinimo());
        subastaImpl.setFechaInicio(subasta.getFechaInicio());
        subastaImpl.setFechaFin(subasta.getFechaFin());
        subastaImpl.setProductoId(subasta.getProductoId());

        return subastaImpl;
    }

    /**
     * Returns the subasta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSubastaException, SystemException {
        Subasta subasta = fetchByPrimaryKey(primaryKey);

        if (subasta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSubastaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return subasta;
    }

    /**
     * Returns the subasta with the primary key or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
     *
     * @param subastaId the primary key of the subasta
     * @return the subasta
     * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta findByPrimaryKey(long subastaId)
        throws NoSuchSubastaException, SystemException {
        return findByPrimaryKey((Serializable) subastaId);
    }

    /**
     * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the subasta
     * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Subasta subasta = (Subasta) EntityCacheUtil.getResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                SubastaImpl.class, primaryKey);

        if (subasta == _nullSubasta) {
            return null;
        }

        if (subasta == null) {
            Session session = null;

            try {
                session = openSession();

                subasta = (Subasta) session.get(SubastaImpl.class, primaryKey);

                if (subasta != null) {
                    cacheResult(subasta);
                } else {
                    EntityCacheUtil.putResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                        SubastaImpl.class, primaryKey, _nullSubasta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SubastaModelImpl.ENTITY_CACHE_ENABLED,
                    SubastaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return subasta;
    }

    /**
     * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param subastaId the primary key of the subasta
     * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Subasta fetchByPrimaryKey(long subastaId) throws SystemException {
        return fetchByPrimaryKey((Serializable) subastaId);
    }

    /**
     * Returns all the subastas.
     *
     * @return the subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the subastas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @return the range of subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the subastas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of subastas
     * @param end the upper bound of the range of subastas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Subasta> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Subasta> list = (List<Subasta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SUBASTA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SUBASTA;

                if (pagination) {
                    sql = sql.concat(SubastaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Subasta>(list);
                } else {
                    list = (List<Subasta>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the subastas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Subasta subasta : findAll()) {
            remove(subasta);
        }
    }

    /**
     * Returns the number of subastas.
     *
     * @return the number of subastas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_SUBASTA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the subasta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.plugins.model.Subasta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Subasta>> listenersList = new ArrayList<ModelListener<Subasta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Subasta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SubastaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
