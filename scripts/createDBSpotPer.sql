-- Criar banco de dados

CREATE DATABASE spotper
ON 
	PRIMARY (
		NAME = 'spotper',
		FILENAME = 'C:\BDSpotPer\spotper.mdf',
		SIZE = 5120KB,
		FILEGROWTH = 30%
	),

	FILEGROUP spotper_fg01 (
		NAME = 'spotper_001',
		FILENAME = 'C:\BDSpotPer\spotper_001.ndf',
		SIZE = 5120KB,
		FILEGROWTH = 30%
	), (
		NAME = 'spotper_002',
		FILENAME = 'C:\BDSpotPer\spotper_002.ndf',
		SIZE = 5120KB,
		FILEGROWTH = 20%
	),

	FILEGROUP spotper_fg02 (
		NAME = 'spotper_003',
		FILENAME = 'C:\BDSpotPer\spotper_003.ndf',
		SIZE = 5120KB,
		FILEGROWTH = 20%
	)

	LOG ON (
		NAME = 'spotper_log',
		FILENAME = 'C:\BDSpotPer\spotper_log.ldf',
		SIZE = 5120KB,
		FILEGROWTH = 20%
	)
