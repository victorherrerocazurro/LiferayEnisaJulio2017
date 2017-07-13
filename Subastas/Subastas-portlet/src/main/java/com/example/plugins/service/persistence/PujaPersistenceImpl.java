package com.example.plugins.service.persistence;

import com.example.plugins.NoSuchPujaException;
import com.example.plugins.model.Puja;
import com.example.plugins.model.impl.PujaImpl;
import com.example.plugins.model.impl.PujaModelImpl;
import com.example.plugins.service.persistence.PujaPersistence;

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
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the puja service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PujaPersistence
 * @see PujaUtil
 * @generated
 */
public class PujaPersistenceImpl extends BasePersistenceImpl<Puja>
    implements PujaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PujaUtil} to access the puja persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PujaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            PujaModelImpl.UUID_COLUMN_BITMASK |
            PujaModelImpl.VALOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "puja.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "puja.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(puja.uuid IS NULL OR puja.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            PujaModelImpl.UUID_COLUMN_BITMASK |
            PujaModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "puja.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "puja.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(puja.uuid IS NULL OR puja.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "puja.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            PujaModelImpl.UUID_COLUMN_BITMASK |
            PujaModelImpl.COMPANYID_COLUMN_BITMASK |
            PujaModelImpl.VALOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "puja.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "puja.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(puja.uuid IS NULL OR puja.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "puja.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBASTA = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySubasta",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTA =
        new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, PujaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySubasta",
            new String[] { Long.class.getName() },
            PujaModelImpl.SUBASTAID_COLUMN_BITMASK |
            PujaModelImpl.VALOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_SUBASTA = new FinderPath(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySubasta",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_SUBASTA_SUBASTAID_2 = "puja.subastaId = ?";
    private static final String _SQL_SELECT_PUJA = "SELECT puja FROM Puja puja";
    private static final String _SQL_SELECT_PUJA_WHERE = "SELECT puja FROM Puja puja WHERE ";
    private static final String _SQL_COUNT_PUJA = "SELECT COUNT(puja) FROM Puja puja";
    private static final String _SQL_COUNT_PUJA_WHERE = "SELECT COUNT(puja) FROM Puja puja WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "puja.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Puja exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Puja exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PujaPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Puja _nullPuja = new PujaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Puja> toCacheModel() {
                return _nullPujaCacheModel;
            }
        };

    private static CacheModel<Puja> _nullPujaCacheModel = new CacheModel<Puja>() {
            @Override
            public Puja toEntityModel() {
                return _nullPuja;
            }
        };

    public PujaPersistenceImpl() {
        setModelClass(Puja.class);
    }

    /**
     * Returns all the pujas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the pujas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @return the range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the pujas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid(String uuid, int start, int end,
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

        List<Puja> list = (List<Puja>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Puja puja : list) {
                if (!Validator.equals(uuid, puja.getUuid())) {
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

            query.append(_SQL_SELECT_PUJA_WHERE);

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
                query.append(PujaModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Puja>(list);
                } else {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first puja in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByUuid_First(uuid, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the first puja in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Puja> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last puja in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByUuid_Last(String uuid, OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByUuid_Last(uuid, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the last puja in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Puja> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the pujas before and after the current puja in the ordered set where uuid = &#63;.
     *
     * @param pujaId the primary key of the current puja
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next puja
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja[] findByUuid_PrevAndNext(long pujaId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = findByPrimaryKey(pujaId);

        Session session = null;

        try {
            session = openSession();

            Puja[] array = new PujaImpl[3];

            array[0] = getByUuid_PrevAndNext(session, puja, uuid,
                    orderByComparator, true);

            array[1] = puja;

            array[2] = getByUuid_PrevAndNext(session, puja, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Puja getByUuid_PrevAndNext(Session session, Puja puja,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PUJA_WHERE);

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
            query.append(PujaModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(puja);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Puja> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the pujas where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Puja puja : findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(puja);
        }
    }

    /**
     * Returns the number of pujas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching pujas
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

            query.append(_SQL_COUNT_PUJA_WHERE);

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
     * Returns the puja where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByUUID_G(String uuid, long groupId)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByUUID_G(uuid, groupId);

        if (puja == null) {
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

            throw new NoSuchPujaException(msg.toString());
        }

        return puja;
    }

    /**
     * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Puja) {
            Puja puja = (Puja) result;

            if (!Validator.equals(uuid, puja.getUuid()) ||
                    (groupId != puja.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_PUJA_WHERE);

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

                List<Puja> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Puja puja = list.get(0);

                    result = puja;

                    cacheResult(puja);

                    if ((puja.getUuid() == null) ||
                            !puja.getUuid().equals(uuid) ||
                            (puja.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, puja);
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
            return (Puja) result;
        }
    }

    /**
     * Removes the puja where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the puja that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja removeByUUID_G(String uuid, long groupId)
        throws NoSuchPujaException, SystemException {
        Puja puja = findByUUID_G(uuid, groupId);

        return remove(puja);
    }

    /**
     * Returns the number of pujas where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching pujas
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

            query.append(_SQL_COUNT_PUJA_WHERE);

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
     * Returns all the pujas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the pujas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @return the range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the pujas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findByUuid_C(String uuid, long companyId, int start,
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

        List<Puja> list = (List<Puja>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Puja puja : list) {
                if (!Validator.equals(uuid, puja.getUuid()) ||
                        (companyId != puja.getCompanyId())) {
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

            query.append(_SQL_SELECT_PUJA_WHERE);

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
                query.append(PujaModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Puja>(list);
                } else {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first puja in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the first puja in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Puja> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last puja in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the last puja in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Puja> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the pujas before and after the current puja in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param pujaId the primary key of the current puja
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next puja
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja[] findByUuid_C_PrevAndNext(long pujaId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = findByPrimaryKey(pujaId);

        Session session = null;

        try {
            session = openSession();

            Puja[] array = new PujaImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, puja, uuid, companyId,
                    orderByComparator, true);

            array[1] = puja;

            array[2] = getByUuid_C_PrevAndNext(session, puja, uuid, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Puja getByUuid_C_PrevAndNext(Session session, Puja puja,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PUJA_WHERE);

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
            query.append(PujaModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(puja);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Puja> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the pujas where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Puja puja : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(puja);
        }
    }

    /**
     * Returns the number of pujas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching pujas
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

            query.append(_SQL_COUNT_PUJA_WHERE);

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
     * Returns all the pujas where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @return the matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findBySubasta(long subastaId) throws SystemException {
        return findBySubasta(subastaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the pujas where subastaId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param subastaId the subasta ID
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @return the range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findBySubasta(long subastaId, int start, int end)
        throws SystemException {
        return findBySubasta(subastaId, start, end, null);
    }

    /**
     * Returns an ordered range of all the pujas where subastaId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param subastaId the subasta ID
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findBySubasta(long subastaId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTA;
            finderArgs = new Object[] { subastaId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBASTA;
            finderArgs = new Object[] { subastaId, start, end, orderByComparator };
        }

        List<Puja> list = (List<Puja>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Puja puja : list) {
                if ((subastaId != puja.getSubastaId())) {
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

            query.append(_SQL_SELECT_PUJA_WHERE);

            query.append(_FINDER_COLUMN_SUBASTA_SUBASTAID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PujaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(subastaId);

                if (!pagination) {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Puja>(list);
                } else {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Returns the first puja in the ordered set where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findBySubasta_First(long subastaId,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchBySubasta_First(subastaId, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("subastaId=");
        msg.append(subastaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the first puja in the ordered set where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchBySubasta_First(long subastaId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Puja> list = findBySubasta(subastaId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last puja in the ordered set where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja
     * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findBySubasta_Last(long subastaId,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchBySubasta_Last(subastaId, orderByComparator);

        if (puja != null) {
            return puja;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("subastaId=");
        msg.append(subastaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPujaException(msg.toString());
    }

    /**
     * Returns the last puja in the ordered set where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching puja, or <code>null</code> if a matching puja could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchBySubasta_Last(long subastaId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBySubasta(subastaId);

        if (count == 0) {
            return null;
        }

        List<Puja> list = findBySubasta(subastaId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the pujas before and after the current puja in the ordered set where subastaId = &#63;.
     *
     * @param pujaId the primary key of the current puja
     * @param subastaId the subasta ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next puja
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja[] findBySubasta_PrevAndNext(long pujaId, long subastaId,
        OrderByComparator orderByComparator)
        throws NoSuchPujaException, SystemException {
        Puja puja = findByPrimaryKey(pujaId);

        Session session = null;

        try {
            session = openSession();

            Puja[] array = new PujaImpl[3];

            array[0] = getBySubasta_PrevAndNext(session, puja, subastaId,
                    orderByComparator, true);

            array[1] = puja;

            array[2] = getBySubasta_PrevAndNext(session, puja, subastaId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Puja getBySubasta_PrevAndNext(Session session, Puja puja,
        long subastaId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PUJA_WHERE);

        query.append(_FINDER_COLUMN_SUBASTA_SUBASTAID_2);

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
            query.append(PujaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(subastaId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(puja);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Puja> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the pujas where subastaId = &#63; from the database.
     *
     * @param subastaId the subasta ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBySubasta(long subastaId) throws SystemException {
        for (Puja puja : findBySubasta(subastaId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(puja);
        }
    }

    /**
     * Returns the number of pujas where subastaId = &#63;.
     *
     * @param subastaId the subasta ID
     * @return the number of matching pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBySubasta(long subastaId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBASTA;

        Object[] finderArgs = new Object[] { subastaId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PUJA_WHERE);

            query.append(_FINDER_COLUMN_SUBASTA_SUBASTAID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(subastaId);

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
     * Caches the puja in the entity cache if it is enabled.
     *
     * @param puja the puja
     */
    @Override
    public void cacheResult(Puja puja) {
        EntityCacheUtil.putResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaImpl.class, puja.getPrimaryKey(), puja);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { puja.getUuid(), puja.getGroupId() }, puja);

        puja.resetOriginalValues();
    }

    /**
     * Caches the pujas in the entity cache if it is enabled.
     *
     * @param pujas the pujas
     */
    @Override
    public void cacheResult(List<Puja> pujas) {
        for (Puja puja : pujas) {
            if (EntityCacheUtil.getResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
                        PujaImpl.class, puja.getPrimaryKey()) == null) {
                cacheResult(puja);
            } else {
                puja.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all pujas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PujaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PujaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the puja.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Puja puja) {
        EntityCacheUtil.removeResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaImpl.class, puja.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(puja);
    }

    @Override
    public void clearCache(List<Puja> pujas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Puja puja : pujas) {
            EntityCacheUtil.removeResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
                PujaImpl.class, puja.getPrimaryKey());

            clearUniqueFindersCache(puja);
        }
    }

    protected void cacheUniqueFindersCache(Puja puja) {
        if (puja.isNew()) {
            Object[] args = new Object[] { puja.getUuid(), puja.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, puja);
        } else {
            PujaModelImpl pujaModelImpl = (PujaModelImpl) puja;

            if ((pujaModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { puja.getUuid(), puja.getGroupId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    puja);
            }
        }
    }

    protected void clearUniqueFindersCache(Puja puja) {
        PujaModelImpl pujaModelImpl = (PujaModelImpl) puja;

        Object[] args = new Object[] { puja.getUuid(), puja.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((pujaModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    pujaModelImpl.getOriginalUuid(),
                    pujaModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new puja with the primary key. Does not add the puja to the database.
     *
     * @param pujaId the primary key for the new puja
     * @return the new puja
     */
    @Override
    public Puja create(long pujaId) {
        Puja puja = new PujaImpl();

        puja.setNew(true);
        puja.setPrimaryKey(pujaId);

        String uuid = PortalUUIDUtil.generate();

        puja.setUuid(uuid);

        return puja;
    }

    /**
     * Removes the puja with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param pujaId the primary key of the puja
     * @return the puja that was removed
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja remove(long pujaId) throws NoSuchPujaException, SystemException {
        return remove((Serializable) pujaId);
    }

    /**
     * Removes the puja with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the puja
     * @return the puja that was removed
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja remove(Serializable primaryKey)
        throws NoSuchPujaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Puja puja = (Puja) session.get(PujaImpl.class, primaryKey);

            if (puja == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPujaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(puja);
        } catch (NoSuchPujaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Puja removeImpl(Puja puja) throws SystemException {
        puja = toUnwrappedModel(puja);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(puja)) {
                puja = (Puja) session.get(PujaImpl.class,
                        puja.getPrimaryKeyObj());
            }

            if (puja != null) {
                session.delete(puja);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (puja != null) {
            clearCache(puja);
        }

        return puja;
    }

    @Override
    public Puja updateImpl(com.example.plugins.model.Puja puja)
        throws SystemException {
        puja = toUnwrappedModel(puja);

        boolean isNew = puja.isNew();

        PujaModelImpl pujaModelImpl = (PujaModelImpl) puja;

        if (Validator.isNull(puja.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            puja.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (puja.isNew()) {
                session.save(puja);

                puja.setNew(false);
            } else {
                session.merge(puja);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PujaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((pujaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { pujaModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { pujaModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((pujaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        pujaModelImpl.getOriginalUuid(),
                        pujaModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        pujaModelImpl.getUuid(), pujaModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((pujaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTA.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        pujaModelImpl.getOriginalSubastaId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBASTA, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTA,
                    args);

                args = new Object[] { pujaModelImpl.getSubastaId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SUBASTA, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBASTA,
                    args);
            }
        }

        EntityCacheUtil.putResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
            PujaImpl.class, puja.getPrimaryKey(), puja);

        clearUniqueFindersCache(puja);
        cacheUniqueFindersCache(puja);

        return puja;
    }

    protected Puja toUnwrappedModel(Puja puja) {
        if (puja instanceof PujaImpl) {
            return puja;
        }

        PujaImpl pujaImpl = new PujaImpl();

        pujaImpl.setNew(puja.isNew());
        pujaImpl.setPrimaryKey(puja.getPrimaryKey());

        pujaImpl.setUuid(puja.getUuid());
        pujaImpl.setPujaId(puja.getPujaId());
        pujaImpl.setGroupId(puja.getGroupId());
        pujaImpl.setCompanyId(puja.getCompanyId());
        pujaImpl.setUserId(puja.getUserId());
        pujaImpl.setUserName(puja.getUserName());
        pujaImpl.setCreateDate(puja.getCreateDate());
        pujaImpl.setModifiedDate(puja.getModifiedDate());
        pujaImpl.setValor(puja.getValor());
        pujaImpl.setSubastaId(puja.getSubastaId());

        return pujaImpl;
    }

    /**
     * Returns the puja with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the puja
     * @return the puja
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPujaException, SystemException {
        Puja puja = fetchByPrimaryKey(primaryKey);

        if (puja == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPujaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return puja;
    }

    /**
     * Returns the puja with the primary key or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
     *
     * @param pujaId the primary key of the puja
     * @return the puja
     * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja findByPrimaryKey(long pujaId)
        throws NoSuchPujaException, SystemException {
        return findByPrimaryKey((Serializable) pujaId);
    }

    /**
     * Returns the puja with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the puja
     * @return the puja, or <code>null</code> if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Puja puja = (Puja) EntityCacheUtil.getResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
                PujaImpl.class, primaryKey);

        if (puja == _nullPuja) {
            return null;
        }

        if (puja == null) {
            Session session = null;

            try {
                session = openSession();

                puja = (Puja) session.get(PujaImpl.class, primaryKey);

                if (puja != null) {
                    cacheResult(puja);
                } else {
                    EntityCacheUtil.putResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
                        PujaImpl.class, primaryKey, _nullPuja);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PujaModelImpl.ENTITY_CACHE_ENABLED,
                    PujaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return puja;
    }

    /**
     * Returns the puja with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param pujaId the primary key of the puja
     * @return the puja, or <code>null</code> if a puja with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Puja fetchByPrimaryKey(long pujaId) throws SystemException {
        return fetchByPrimaryKey((Serializable) pujaId);
    }

    /**
     * Returns all the pujas.
     *
     * @return the pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the pujas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @return the range of pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the pujas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of pujas
     * @param end the upper bound of the range of pujas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of pujas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Puja> findAll(int start, int end,
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

        List<Puja> list = (List<Puja>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PUJA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PUJA;

                if (pagination) {
                    sql = sql.concat(PujaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Puja>(list);
                } else {
                    list = (List<Puja>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the pujas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Puja puja : findAll()) {
            remove(puja);
        }
    }

    /**
     * Returns the number of pujas.
     *
     * @return the number of pujas
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

                Query q = session.createQuery(_SQL_COUNT_PUJA);

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
     * Initializes the puja persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.plugins.model.Puja")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Puja>> listenersList = new ArrayList<ModelListener<Puja>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Puja>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PujaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
