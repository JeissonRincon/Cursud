;-- 1. Logearse con System y correr este script

--Tablespace para los usuariosCURSUD

CREATE TABLESPACE DEFCURSUD DATAFILE
'C:\oraclexe\app\oracle\oradata\XE\DEFCURSUD.DBF' SIZE 40M AUTOEXTEND ON;

CREATE TEMPORARY TABLESPACE TEMPCURSUD TEMPFILE
'C:\oraclexe\app\oracle\oradata\XE\TEMPCURSUD.DBF' SIZE 20M AUTOEXTEND ON;

-- Crear ADMINUSU
CREATE USER consultador IDENTIFIED BY 123
DEFAULT TABLESPACE DEFCURSUD
TEMPORARY TABLESPACE TEMPCURSUD
QUOTA 10M ON DEFCURSUD;

-- permisos para el que consulta e inserta
grant connect to consultador;
grant create table to consultador;
grant create sequence to consultador;
