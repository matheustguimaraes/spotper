-- Criar tabelas
USE spotper

CREATE TABLE gravadora (
	cod INT NOT NULL,
	nome NVARCHAR(50) NOT NULL,
	homepage NVARCHAR(50),
	pais NVARCHAR(50) NOT NULL,
	cidade NVARCHAR(50) NOT NULL,
	rua NVARCHAR(50) NOT NULL,

	CONSTRAINT gravadora_PK PRIMARY KEY (cod)
) ON spotper_fg01;

CREATE TABLE periodo_musical (
	id INT NOT NULL,
	inicio_periodo DATE NOT NULL,
	fim_periodo DATE,
	descricao NVARCHAR(50) NOT NULL,

	CONSTRAINT periodo_musical_PK PRIMARY KEY (id)
) ON spotper_fg01;

CREATE TABLE compositor (
	id_compositor INT NOT NULL,
	id_periodo INT NOT NULL,
	dt_nascimento DATE NOT NULL,
	dt_morte DATE,
	pais NVARCHAR(50) NOT NULL,
	cidade NVARCHAR(50) NOT NULL,
	nome NVARCHAR(50) NOT NULL

	CONSTRAINT compositor_PK PRIMARY KEY (id_compositor),
	CONSTRAINT compositor_periodo_musical_FK FOREIGN KEY (id_periodo) 
		REFERENCES periodo_musical ON DELETE NO ACTION ON UPDATE CASCADE
) ON spotper_fg01;

CREATE TABLE tipo_interprete (
	id INT NOT NULL,
	tipo NVARCHAR(50) NOT NULL,

	CONSTRAINT tipo_interprete_PK PRIMARY KEY (id)
) ON spotper_fg01;

CREATE TABLE interprete (
	id_interprete INT NOT NULL,
	id_tipo_interprete INT NOT NULL,
	nome NVARCHAR(50),

	CONSTRAINT interprete_PK PRIMARY KEY (id_interprete),
	CONSTRAINT interprete_tipo_inter_FK FOREIGN KEY (id_tipo_interprete)
		REFERENCES tipo_interprete ON DELETE NO ACTION ON UPDATE CASCADE
) ON spotper_fg01;

CREATE TABLE album (
	id INT NOT NULL,
	cod_gravadora INT NOT NULL,
	descricao NVARCHAR(50) NOT NULL,
	tipo_compra NVARCHAR(50) NOT NULL,
	dt_gravacao DATE NOT NULL,
	dt_compra DATE,
	preco_compra DECIMAL(10,2),
	nome NVARCHAR(50) NOT NULL,

	CONSTRAINT album_PK PRIMARY KEY (id),
	CONSTRAINT album_gravadora_FK FOREIGN KEY (cod_gravadora)
		REFERENCES gravadora ON DELETE CASCADE ON UPDATE CASCADE,
) ON spotper_fg01;

CREATE TABLE tipo_composicao (
	id INT NOT NULL,
	descricao NVARCHAR(50) NOT NULL,

	CONSTRAINT tipo_composicao_PK PRIMARY KEY (id)
) ON spotper_fg01;

CREATE TABLE faixa (
	num_faixa INT NOT NULL,
	id_album INT NOT NULL,
	id_tipo_composicao INT NOT NULL,
	descricao NVARCHAR(50) NOT NULL,
	tipo_gravacao NVARCHAR(3) NOT NULL,
	tempo_duracao DECIMAL(10,2) NOT NULL,

	CONSTRAINT faixa_PK PRIMARY KEY (num_faixa, id_album),
	CONSTRAINT faixa_tipo_composicao_FK FOREIGN KEY (id_tipo_composicao)
		REFERENCES tipo_composicao ON DELETE NO ACTION ON UPDATE CASCADE,
	CONSTRAINT faixa_album_FK FOREIGN KEY (id_album)
		REFERENCES album ON DELETE CASCADE ON UPDATE CASCADE
) ON spotper_fg02;

CREATE TABLE faixa_compositor (
	id_compositor INT NOT NULL,
	num_faixa INT NOT NULL,
	id_album INT NOT NULL,

	CONSTRAINT faixa_compositor_PK PRIMARY KEY (id_compositor, num_faixa, id_album),
	CONSTRAINT faixa_compositor_comp_FK FOREIGN KEY (id_compositor) 
		REFERENCES compositor ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT faixa_compositor_faixa_FK FOREIGN KEY (num_faixa, id_album)
		REFERENCES faixa (num_faixa, id_album) ON DELETE CASCADE ON UPDATE CASCADE
) ON spotper_fg01;

CREATE TABLE telefone_gravadora (
	cod INT NOT NULL,
	telefone NVARCHAR(20) NOT NULL,

	CONSTRAINT telefone_gravadora_PK PRIMARY KEY (cod, telefone),
	CONSTRAINT tel_gravadora_FK FOREIGN KEY (cod)
		REFERENCES gravadora ON DELETE CASCADE ON UPDATE CASCADE
) ON spotper_fg01;

CREATE TABLE faixa_interprete (
	id_interprete INT NOT NULL,
	id_album INT NOT NULL,
	num_faixa INT NOT NULL,

	CONSTRAINT faixa_interprete_PK PRIMARY KEY (id_interprete, num_faixa, id_album),
	CONSTRAINT faixa_interprete_inter_FK FOREIGN KEY (id_interprete)
	REFERENCES interprete ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT faixa_interprete_faixa_FK FOREIGN KEY (num_faixa, id_album)
		REFERENCES faixa (num_faixa, id_album) ON DELETE CASCADE ON UPDATE CASCADE
) ON spotper_fg01;

CREATE TABLE playlist (
	id INT NOT NULL,
	nome NVARCHAR(50) NOT NULL,
	dt_criacao DATE NOT NULL,
	tempo_total_execucao DECIMAL(10,2),

	CONSTRAINT playlist_PK PRIMARY KEY (id)
) ON spotper_fg02;

CREATE TABLE faixa_playlist (
	id_playlist INT NOT NULL,
	id_album INT NOT NULL,
	num_faixa INT NOT NULL,
	qtde_tocada INT,
	dt_ultima_vez_tocada DATE,

	CONSTRAINT faixa_playlist_PK PRIMARY KEY (id_playlist, num_faixa, id_album),
	CONSTRAINT faixa_playlist_play_FK FOREIGN KEY (id_playlist)
		REFERENCES playlist ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT faixa_playlist_faixa_FK FOREIGN KEY (num_faixa, id_album)
		REFERENCES faixa (num_faixa, id_album) ON DELETE CASCADE ON UPDATE CASCADE
) ON spotper_fg02;
