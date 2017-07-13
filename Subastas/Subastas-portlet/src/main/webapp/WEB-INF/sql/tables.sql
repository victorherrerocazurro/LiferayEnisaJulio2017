create table Subastas_Producto (
	uuid_ VARCHAR(75) null,
	productoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	precio DOUBLE
);

create table Subastas_Puja (
	uuid_ VARCHAR(75) null,
	pujaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	valor DOUBLE,
	subastaId LONG
);

create table Subastas_Subasta (
	uuid_ VARCHAR(75) null,
	subastaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	precioMinimo DOUBLE,
	fechaInicio DATE null,
	fechaFin DATE null,
	productoId LONG
);