create index IX_BD63624E on Subastas_Producto (nombre);
create index IX_F667C588 on Subastas_Producto (nombre, precio);
create index IX_1E3BCE8B on Subastas_Producto (precio);
create index IX_CCBF7E43 on Subastas_Producto (uuid_);
create index IX_663E0E05 on Subastas_Producto (uuid_, companyId);
create unique index IX_D18C51C7 on Subastas_Producto (uuid_, groupId);

create index IX_26BDB37D on Subastas_Puja (subastaId);
create index IX_7CA793A7 on Subastas_Puja (uuid_);
create index IX_C94B7221 on Subastas_Puja (uuid_, companyId);
create unique index IX_F99C0CE3 on Subastas_Puja (uuid_, groupId);

create index IX_E608211A on Subastas_Subasta (fechaInicio, fechaFin);
create index IX_7528D69A on Subastas_Subasta (uuid_);
create index IX_406CE94E on Subastas_Subasta (uuid_, companyId);
create unique index IX_D31B6B50 on Subastas_Subasta (uuid_, groupId);