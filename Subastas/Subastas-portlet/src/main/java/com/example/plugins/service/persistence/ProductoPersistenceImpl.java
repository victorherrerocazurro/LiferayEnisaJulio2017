package com.example.plugins.service.persistence;

import com.example.plugins.NoSuchProductoException;
import com.example.plugins.model.Producto;
import com.example.plugins.model.impl.ProductoImpl;
import com.example.plugins.model.impl.ProductoModelImpl;
import com.example.plugins.service.persistence.ProductoPersistence;

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
import com.liferay.portal.kernel.util.ArrayUtil;
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
 * The persistence implementation for the producto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductoPersistence
 * @see ProductoUtil
 * @generated
 */
public class ProductoPersistenceImpl extends BasePersistenceImpl<Producto>
    implements ProductoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ProductoUtil} to access the producto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ProductoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            ProductoModelImpl.UUID_COLUMN_BITMASK |
            ProductoModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "producto.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "producto.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(producto.uuid IS NULL OR producto.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            ProductoModelImpl.UUID_COLUMN_BITMASK |
            ProductoModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "producto.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "producto.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(producto.uuid IS NULL OR producto.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "producto.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            ProductoModelImpl.UUID_COLUMN_BITMASK |
            ProductoModelImpl.COMPANYID_COLUMN_BITMASK |
            ProductoModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "producto.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "producto.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(producto.uuid IS NULL OR producto.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "producto.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombre",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE =
        new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombre",
            new String[] { String.class.getName() },
            ProductoModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRE = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombre",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_1 = "producto.nombre IS NULL";
    private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_2 = "producto.nombre = ?";
    private static final String _FINDER_COLUMN_NOMBRE_NOMBRE_3 = "(producto.nombre IS NULL OR producto.nombre = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE_PRECIO =
        new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombre_Precio",
            new String[] {
                String.class.getName(), Double.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE_PRECIO =
        new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombre_Precio",
            new String[] { String.class.getName(), Double.class.getName() },
            ProductoModelImpl.NOMBRE_COLUMN_BITMASK |
            ProductoModelImpl.PRECIO_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRE_PRECIO = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombre_Precio",
            new String[] { String.class.getName(), Double.class.getName() });
    private static final String _FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_1 = "producto.nombre IS NULL AND ";
    private static final String _FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_2 = "producto.nombre = ? AND ";
    private static final String _FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_3 = "(producto.nombre IS NULL OR producto.nombre = '') AND ";
    private static final String _FINDER_COLUMN_NOMBRE_PRECIO_PRECIO_2 = "producto.precio = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRES = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNombres",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRES =
        new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNombres",
            new String[] { String.class.getName() },
            ProductoModelImpl.NOMBRE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NOMBRES = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNombres",
            new String[] { String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBRES = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByNombres",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_1 = "producto.nombre IS NULL";
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_2 = "producto.nombre = ?";
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_3 = "(producto.nombre IS NULL OR producto.nombre = '')";
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_4 = "(" +
        removeConjunction(_FINDER_COLUMN_NOMBRES_NOMBRE_1) + ")";
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_5 = "(" +
        removeConjunction(_FINDER_COLUMN_NOMBRES_NOMBRE_2) + ")";
    private static final String _FINDER_COLUMN_NOMBRES_NOMBRE_6 = "(" +
        removeConjunction(_FINDER_COLUMN_NOMBRES_NOMBRE_3) + ")";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRECIO = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, ProductoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPrecio",
            new String[] {
                Double.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_PRECIO = new FinderPath(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByPrecio",
            new String[] { Double.class.getName() });
    private static final String _FINDER_COLUMN_PRECIO_PRECIO_2 = "producto.precio <= ?";
    private static final String _SQL_SELECT_PRODUCTO = "SELECT producto FROM Producto producto";
    private static final String _SQL_SELECT_PRODUCTO_WHERE = "SELECT producto FROM Producto producto WHERE ";
    private static final String _SQL_COUNT_PRODUCTO = "SELECT COUNT(producto) FROM Producto producto";
    private static final String _SQL_COUNT_PRODUCTO_WHERE = "SELECT COUNT(producto) FROM Producto producto WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "producto.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Producto exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Producto exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ProductoPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Producto _nullProducto = new ProductoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Producto> toCacheModel() {
                return _nullProductoCacheModel;
            }
        };

    private static CacheModel<Producto> _nullProductoCacheModel = new CacheModel<Producto>() {
            @Override
            public Producto toEntityModel() {
                return _nullProducto;
            }
        };

    public ProductoPersistenceImpl() {
        setModelClass(Producto.class);
    }

    /**
     * Returns all the productos where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid(String uuid, int start, int end,
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

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!Validator.equals(uuid, producto.getUuid())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

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
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByUuid_First(uuid, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByUuid_Last(uuid, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where uuid = &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByUuid_PrevAndNext(long productoId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByUuid_PrevAndNext(session, producto, uuid,
                    orderByComparator, true);

            array[1] = producto;

            array[2] = getByUuid_PrevAndNext(session, producto, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByUuid_PrevAndNext(Session session,
        Producto producto, String uuid, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the productos where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Producto producto : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching productos
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

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

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
     * Returns the producto where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByUUID_G(String uuid, long groupId)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByUUID_G(uuid, groupId);

        if (producto == null) {
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

            throw new NoSuchProductoException(msg.toString());
        }

        return producto;
    }

    /**
     * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Producto) {
            Producto producto = (Producto) result;

            if (!Validator.equals(uuid, producto.getUuid()) ||
                    (groupId != producto.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

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

                List<Producto> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Producto producto = list.get(0);

                    result = producto;

                    cacheResult(producto);

                    if ((producto.getUuid() == null) ||
                            !producto.getUuid().equals(uuid) ||
                            (producto.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, producto);
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
            return (Producto) result;
        }
    }

    /**
     * Removes the producto where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the producto that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto removeByUUID_G(String uuid, long groupId)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByUUID_G(uuid, groupId);

        return remove(producto);
    }

    /**
     * Returns the number of productos where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching productos
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

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

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
     * Returns all the productos where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByUuid_C(String uuid, long companyId, int start,
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

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!Validator.equals(uuid, producto.getUuid()) ||
                        (companyId != producto.getCompanyId())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

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
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByUuid_C_PrevAndNext(long productoId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, producto, uuid,
                    companyId, orderByComparator, true);

            array[1] = producto;

            array[2] = getByUuid_C_PrevAndNext(session, producto, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByUuid_C_PrevAndNext(Session session,
        Producto producto, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the productos where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Producto producto : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching productos
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

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

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
     * Returns all the productos where nombre = &#63;.
     *
     * @param nombre the nombre
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre(String nombre) throws SystemException {
        return findByNombre(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where nombre = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre(String nombre, int start, int end)
        throws SystemException {
        return findByNombre(nombre, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where nombre = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre(String nombre, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE;
            finderArgs = new Object[] { nombre };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE;
            finderArgs = new Object[] { nombre, start, end, orderByComparator };
        }

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!Validator.equals(nombre, producto.getNombre())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombre_First(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombre_First(nombre, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombre_First(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByNombre(nombre, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombre_Last(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombre_Last(nombre, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombre_Last(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNombre(nombre);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByNombre(nombre, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where nombre = &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByNombre_PrevAndNext(long productoId, String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByNombre_PrevAndNext(session, producto, nombre,
                    orderByComparator, true);

            array[1] = producto;

            array[2] = getByNombre_PrevAndNext(session, producto, nombre,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByNombre_PrevAndNext(Session session,
        Producto producto, String nombre, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

        boolean bindNombre = false;

        if (nombre == null) {
            query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
        } else if (nombre.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
        } else {
            bindNombre = true;

            query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNombre) {
            qPos.add(nombre);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the productos where nombre = &#63; from the database.
     *
     * @param nombre the nombre
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNombre(String nombre) throws SystemException {
        for (Producto producto : findByNombre(nombre, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where nombre = &#63;.
     *
     * @param nombre the nombre
     * @return the number of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNombre(String nombre) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NOMBRE;

        Object[] finderArgs = new Object[] { nombre };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRE_NOMBRE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
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
     * Returns all the productos where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre_Precio(String nombre, double precio)
        throws SystemException {
        return findByNombre_Precio(nombre, precio, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where nombre = &#63; and precio = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre_Precio(String nombre, double precio,
        int start, int end) throws SystemException {
        return findByNombre_Precio(nombre, precio, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where nombre = &#63; and precio = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombre_Precio(String nombre, double precio,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE_PRECIO;
            finderArgs = new Object[] { nombre, precio };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRE_PRECIO;
            finderArgs = new Object[] {
                    nombre, precio,
                    
                    start, end, orderByComparator
                };
        }

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!Validator.equals(nombre, producto.getNombre()) ||
                        (precio != producto.getPrecio())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_2);
            }

            query.append(_FINDER_COLUMN_NOMBRE_PRECIO_PRECIO_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

                qPos.add(precio);

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombre_Precio_First(String nombre, double precio,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombre_Precio_First(nombre, precio,
                orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(", precio=");
        msg.append(precio);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombre_Precio_First(String nombre, double precio,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByNombre_Precio(nombre, precio, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombre_Precio_Last(String nombre, double precio,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombre_Precio_Last(nombre, precio,
                orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(", precio=");
        msg.append(precio);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombre_Precio_Last(String nombre, double precio,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNombre_Precio(nombre, precio);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByNombre_Precio(nombre, precio, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where nombre = &#63; and precio = &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param nombre the nombre
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByNombre_Precio_PrevAndNext(long productoId,
        String nombre, double precio, OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByNombre_Precio_PrevAndNext(session, producto,
                    nombre, precio, orderByComparator, true);

            array[1] = producto;

            array[2] = getByNombre_Precio_PrevAndNext(session, producto,
                    nombre, precio, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByNombre_Precio_PrevAndNext(Session session,
        Producto producto, String nombre, double precio,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

        boolean bindNombre = false;

        if (nombre == null) {
            query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_1);
        } else if (nombre.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_3);
        } else {
            bindNombre = true;

            query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_2);
        }

        query.append(_FINDER_COLUMN_NOMBRE_PRECIO_PRECIO_2);

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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNombre) {
            qPos.add(nombre);
        }

        qPos.add(precio);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the productos where nombre = &#63; and precio = &#63; from the database.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNombre_Precio(String nombre, double precio)
        throws SystemException {
        for (Producto producto : findByNombre_Precio(nombre, precio,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where nombre = &#63; and precio = &#63;.
     *
     * @param nombre the nombre
     * @param precio the precio
     * @return the number of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNombre_Precio(String nombre, double precio)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NOMBRE_PRECIO;

        Object[] finderArgs = new Object[] { nombre, precio };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRE_PRECIO_NOMBRE_2);
            }

            query.append(_FINDER_COLUMN_NOMBRE_PRECIO_PRECIO_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

                qPos.add(precio);

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
     * Returns all the productos where nombre = &#63;.
     *
     * @param nombre the nombre
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String nombre)
        throws SystemException {
        return findByNombres(nombre, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where nombre = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String nombre, int start, int end)
        throws SystemException {
        return findByNombres(nombre, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where nombre = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombre the nombre
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String nombre, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRES;
            finderArgs = new Object[] { nombre };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRES;
            finderArgs = new Object[] { nombre, start, end, orderByComparator };
        }

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!Validator.equals(nombre, producto.getNombre())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
                }

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombres_First(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombres_First(nombre, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombres_First(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByNombres(nombre, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByNombres_Last(String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByNombres_Last(nombre, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("nombre=");
        msg.append(nombre);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where nombre = &#63;.
     *
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByNombres_Last(String nombre,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByNombres(nombre);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByNombres(nombre, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where nombre = &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param nombre the nombre
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByNombres_PrevAndNext(long productoId, String nombre,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByNombres_PrevAndNext(session, producto, nombre,
                    orderByComparator, true);

            array[1] = producto;

            array[2] = getByNombres_PrevAndNext(session, producto, nombre,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByNombres_PrevAndNext(Session session,
        Producto producto, String nombre, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

        boolean bindNombre = false;

        if (nombre == null) {
            query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_1);
        } else if (nombre.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_3);
        } else {
            bindNombre = true;

            query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_2);
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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindNombre) {
            qPos.add(nombre);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the productos where nombre = any &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombres the nombres
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String[] nombres)
        throws SystemException {
        return findByNombres(nombres, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where nombre = any &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombres the nombres
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String[] nombres, int start, int end)
        throws SystemException {
        return findByNombres(nombres, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where nombre = any &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param nombres the nombres
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByNombres(String[] nombres, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        if ((nombres != null) && (nombres.length == 1)) {
            return findByNombres(nombres[0], start, end, orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] { StringUtil.merge(nombres) };
        } else {
            finderArgs = new Object[] {
                    StringUtil.merge(nombres),
                    
                    start, end, orderByComparator
                };
        }

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRES,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if (!ArrayUtil.contains(nombres, producto.getNombre())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

            boolean conjunctionable = false;

            if ((nombres == null) || (nombres.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < nombres.length; i++) {
                    String nombre = nombres[i];

                    if (nombre == null) {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_4);
                    } else if (nombre.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_6);
                    } else {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_5);
                    }

                    if ((i + 1) < nombres.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (nombres != null) {
                    qPos.add(nombres);
                }

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRES,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMBRES,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the productos where nombre = &#63; from the database.
     *
     * @param nombre the nombre
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByNombres(String nombre) throws SystemException {
        for (Producto producto : findByNombres(nombre, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where nombre = &#63;.
     *
     * @param nombre the nombre
     * @return the number of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNombres(String nombre) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NOMBRES;

        Object[] finderArgs = new Object[] { nombre };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

            boolean bindNombre = false;

            if (nombre == null) {
                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_1);
            } else if (nombre.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_3);
            } else {
                bindNombre = true;

                query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindNombre) {
                    qPos.add(nombre);
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
     * Returns the number of productos where nombre = any &#63;.
     *
     * @param nombres the nombres
     * @return the number of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByNombres(String[] nombres) throws SystemException {
        Object[] finderArgs = new Object[] { StringUtil.merge(nombres) };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBRES,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

            boolean conjunctionable = false;

            if ((nombres == null) || (nombres.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < nombres.length; i++) {
                    String nombre = nombres[i];

                    if (nombre == null) {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_4);
                    } else if (nombre.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_6);
                    } else {
                        query.append(_FINDER_COLUMN_NOMBRES_NOMBRE_5);
                    }

                    if ((i + 1) < nombres.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (nombres != null) {
                    qPos.add(nombres);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBRES,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NOMBRES,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the productos where precio &le; &#63;.
     *
     * @param precio the precio
     * @return the matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByPrecio(double precio) throws SystemException {
        return findByPrecio(precio, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos where precio &le; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param precio the precio
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByPrecio(double precio, int start, int end)
        throws SystemException {
        return findByPrecio(precio, start, end, null);
    }

    /**
     * Returns an ordered range of all the productos where precio &le; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param precio the precio
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findByPrecio(double precio, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRECIO;
        finderArgs = new Object[] { precio, start, end, orderByComparator };

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Producto producto : list) {
                if ((precio < producto.getPrecio())) {
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

            query.append(_SQL_SELECT_PRODUCTO_WHERE);

            query.append(_FINDER_COLUMN_PRECIO_PRECIO_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ProductoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(precio);

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Returns the first producto in the ordered set where precio &le; &#63;.
     *
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByPrecio_First(double precio,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByPrecio_First(precio, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("precio=");
        msg.append(precio);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the first producto in the ordered set where precio &le; &#63;.
     *
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByPrecio_First(double precio,
        OrderByComparator orderByComparator) throws SystemException {
        List<Producto> list = findByPrecio(precio, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last producto in the ordered set where precio &le; &#63;.
     *
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto
     * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByPrecio_Last(double precio,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByPrecio_Last(precio, orderByComparator);

        if (producto != null) {
            return producto;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("precio=");
        msg.append(precio);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchProductoException(msg.toString());
    }

    /**
     * Returns the last producto in the ordered set where precio &le; &#63;.
     *
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching producto, or <code>null</code> if a matching producto could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByPrecio_Last(double precio,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPrecio(precio);

        if (count == 0) {
            return null;
        }

        List<Producto> list = findByPrecio(precio, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the productos before and after the current producto in the ordered set where precio &le; &#63;.
     *
     * @param productoId the primary key of the current producto
     * @param precio the precio
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto[] findByPrecio_PrevAndNext(long productoId, double precio,
        OrderByComparator orderByComparator)
        throws NoSuchProductoException, SystemException {
        Producto producto = findByPrimaryKey(productoId);

        Session session = null;

        try {
            session = openSession();

            Producto[] array = new ProductoImpl[3];

            array[0] = getByPrecio_PrevAndNext(session, producto, precio,
                    orderByComparator, true);

            array[1] = producto;

            array[2] = getByPrecio_PrevAndNext(session, producto, precio,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Producto getByPrecio_PrevAndNext(Session session,
        Producto producto, double precio, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PRODUCTO_WHERE);

        query.append(_FINDER_COLUMN_PRECIO_PRECIO_2);

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
            query.append(ProductoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(precio);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(producto);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Producto> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the productos where precio &le; &#63; from the database.
     *
     * @param precio the precio
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPrecio(double precio) throws SystemException {
        for (Producto producto : findByPrecio(precio, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos where precio &le; &#63;.
     *
     * @param precio the precio
     * @return the number of matching productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPrecio(double precio) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_PRECIO;

        Object[] finderArgs = new Object[] { precio };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PRODUCTO_WHERE);

            query.append(_FINDER_COLUMN_PRECIO_PRECIO_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(precio);

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
     * Caches the producto in the entity cache if it is enabled.
     *
     * @param producto the producto
     */
    @Override
    public void cacheResult(Producto producto) {
        EntityCacheUtil.putResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoImpl.class, producto.getPrimaryKey(), producto);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { producto.getUuid(), producto.getGroupId() }, producto);

        producto.resetOriginalValues();
    }

    /**
     * Caches the productos in the entity cache if it is enabled.
     *
     * @param productos the productos
     */
    @Override
    public void cacheResult(List<Producto> productos) {
        for (Producto producto : productos) {
            if (EntityCacheUtil.getResult(
                        ProductoModelImpl.ENTITY_CACHE_ENABLED,
                        ProductoImpl.class, producto.getPrimaryKey()) == null) {
                cacheResult(producto);
            } else {
                producto.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all productos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ProductoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ProductoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the producto.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Producto producto) {
        EntityCacheUtil.removeResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoImpl.class, producto.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(producto);
    }

    @Override
    public void clearCache(List<Producto> productos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Producto producto : productos) {
            EntityCacheUtil.removeResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
                ProductoImpl.class, producto.getPrimaryKey());

            clearUniqueFindersCache(producto);
        }
    }

    protected void cacheUniqueFindersCache(Producto producto) {
        if (producto.isNew()) {
            Object[] args = new Object[] {
                    producto.getUuid(), producto.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                producto);
        } else {
            ProductoModelImpl productoModelImpl = (ProductoModelImpl) producto;

            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        producto.getUuid(), producto.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    producto);
            }
        }
    }

    protected void clearUniqueFindersCache(Producto producto) {
        ProductoModelImpl productoModelImpl = (ProductoModelImpl) producto;

        Object[] args = new Object[] { producto.getUuid(), producto.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((productoModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    productoModelImpl.getOriginalUuid(),
                    productoModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new producto with the primary key. Does not add the producto to the database.
     *
     * @param productoId the primary key for the new producto
     * @return the new producto
     */
    @Override
    public Producto create(long productoId) {
        Producto producto = new ProductoImpl();

        producto.setNew(true);
        producto.setPrimaryKey(productoId);

        String uuid = PortalUUIDUtil.generate();

        producto.setUuid(uuid);

        return producto;
    }

    /**
     * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param productoId the primary key of the producto
     * @return the producto that was removed
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto remove(long productoId)
        throws NoSuchProductoException, SystemException {
        return remove((Serializable) productoId);
    }

    /**
     * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the producto
     * @return the producto that was removed
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto remove(Serializable primaryKey)
        throws NoSuchProductoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Producto producto = (Producto) session.get(ProductoImpl.class,
                    primaryKey);

            if (producto == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchProductoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(producto);
        } catch (NoSuchProductoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Producto removeImpl(Producto producto) throws SystemException {
        producto = toUnwrappedModel(producto);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(producto)) {
                producto = (Producto) session.get(ProductoImpl.class,
                        producto.getPrimaryKeyObj());
            }

            if (producto != null) {
                session.delete(producto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (producto != null) {
            clearCache(producto);
        }

        return producto;
    }

    @Override
    public Producto updateImpl(com.example.plugins.model.Producto producto)
        throws SystemException {
        producto = toUnwrappedModel(producto);

        boolean isNew = producto.isNew();

        ProductoModelImpl productoModelImpl = (ProductoModelImpl) producto;

        if (Validator.isNull(producto.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            producto.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (producto.isNew()) {
                session.save(producto);

                producto.setNew(false);
            } else {
                session.merge(producto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ProductoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { productoModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { productoModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productoModelImpl.getOriginalUuid(),
                        productoModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        productoModelImpl.getUuid(),
                        productoModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productoModelImpl.getOriginalNombre()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
                    args);

                args = new Object[] { productoModelImpl.getNombre() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE,
                    args);
            }

            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE_PRECIO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productoModelImpl.getOriginalNombre(),
                        productoModelImpl.getOriginalPrecio()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE_PRECIO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE_PRECIO,
                    args);

                args = new Object[] {
                        productoModelImpl.getNombre(),
                        productoModelImpl.getPrecio()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRE_PRECIO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRE_PRECIO,
                    args);
            }

            if ((productoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRES.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        productoModelImpl.getOriginalNombre()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRES, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRES,
                    args);

                args = new Object[] { productoModelImpl.getNombre() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMBRES, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMBRES,
                    args);
            }
        }

        EntityCacheUtil.putResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
            ProductoImpl.class, producto.getPrimaryKey(), producto);

        clearUniqueFindersCache(producto);
        cacheUniqueFindersCache(producto);

        return producto;
    }

    protected Producto toUnwrappedModel(Producto producto) {
        if (producto instanceof ProductoImpl) {
            return producto;
        }

        ProductoImpl productoImpl = new ProductoImpl();

        productoImpl.setNew(producto.isNew());
        productoImpl.setPrimaryKey(producto.getPrimaryKey());

        productoImpl.setUuid(producto.getUuid());
        productoImpl.setProductoId(producto.getProductoId());
        productoImpl.setGroupId(producto.getGroupId());
        productoImpl.setCompanyId(producto.getCompanyId());
        productoImpl.setUserId(producto.getUserId());
        productoImpl.setUserName(producto.getUserName());
        productoImpl.setCreateDate(producto.getCreateDate());
        productoImpl.setModifiedDate(producto.getModifiedDate());
        productoImpl.setNombre(producto.getNombre());
        productoImpl.setDescripcion(producto.getDescripcion());
        productoImpl.setPrecio(producto.getPrecio());

        return productoImpl;
    }

    /**
     * Returns the producto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the producto
     * @return the producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByPrimaryKey(Serializable primaryKey)
        throws NoSuchProductoException, SystemException {
        Producto producto = fetchByPrimaryKey(primaryKey);

        if (producto == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchProductoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return producto;
    }

    /**
     * Returns the producto with the primary key or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
     *
     * @param productoId the primary key of the producto
     * @return the producto
     * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto findByPrimaryKey(long productoId)
        throws NoSuchProductoException, SystemException {
        return findByPrimaryKey((Serializable) productoId);
    }

    /**
     * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the producto
     * @return the producto, or <code>null</code> if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Producto producto = (Producto) EntityCacheUtil.getResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
                ProductoImpl.class, primaryKey);

        if (producto == _nullProducto) {
            return null;
        }

        if (producto == null) {
            Session session = null;

            try {
                session = openSession();

                producto = (Producto) session.get(ProductoImpl.class, primaryKey);

                if (producto != null) {
                    cacheResult(producto);
                } else {
                    EntityCacheUtil.putResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
                        ProductoImpl.class, primaryKey, _nullProducto);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ProductoModelImpl.ENTITY_CACHE_ENABLED,
                    ProductoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return producto;
    }

    /**
     * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param productoId the primary key of the producto
     * @return the producto, or <code>null</code> if a producto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Producto fetchByPrimaryKey(long productoId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) productoId);
    }

    /**
     * Returns all the productos.
     *
     * @return the productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the productos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @return the range of productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the productos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of productos
     * @param end the upper bound of the range of productos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of productos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Producto> findAll(int start, int end,
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

        List<Producto> list = (List<Producto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PRODUCTO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PRODUCTO;

                if (pagination) {
                    sql = sql.concat(ProductoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Producto>(list);
                } else {
                    list = (List<Producto>) QueryUtil.list(q, getDialect(),
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
     * Removes all the productos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Producto producto : findAll()) {
            remove(producto);
        }
    }

    /**
     * Returns the number of productos.
     *
     * @return the number of productos
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

                Query q = session.createQuery(_SQL_COUNT_PRODUCTO);

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
     * Initializes the producto persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.plugins.model.Producto")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Producto>> listenersList = new ArrayList<ModelListener<Producto>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Producto>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ProductoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
