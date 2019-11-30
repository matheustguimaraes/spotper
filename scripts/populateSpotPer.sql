use spotper

insert into gravadora values (1, 'Sony', NULL, 'Coreia', 'Seul', 'Seila')
insert into gravadora values (2, 'Kondzilla', 'kondzilla.com', 'Brasil', 'SP', 'rua do limoeiro')
insert into gravadora values (3, 'GR6', NULL, 'Brasil', 'Rio', 'avenida brasil')

insert into album values (1, 1, 'funk 1', 'download', '2019-01-02', '2019-08-01', 12.20)
insert into album values (2, 3, 'rap 1', 'fisico', '2019-03-22', '2019-05-15', 25.20)
insert into album values (3, 2, 'funk 2', 'download', '2019-08-15', NULL, 30.50)
insert into album values (4, 3, 'forro 1', 'download', '2018-06-26', '2018-12-20', 10.30)

insert into tipo_composicao values (1, 'rap')
insert into tipo_composicao values (2, 'rock')
insert into tipo_composicao values (3, 'funk')

insert into faixa values (1, 1, 1, 'Faixa 1', 'cdd', 22.23)
insert into faixa values (2, 3, 1, 'Faixa 2', 'add', 56.12)
insert into faixa values (3, 2, 1, 'Faixa 3', 'cdd', 45.50)
insert into faixa values (4, 4, 1, 'Faixa 4', 'add', 20.50)
insert into faixa values (5, 1, 1, 'Faixa 5', 'cdd', 80.66)

insert into playlist values (1, 'playlist arrocha', '2019-04-12', 42.22)
insert into playlist values (2, 'play forro', '2019-11-18', 56.50)

insert into faixa_playlist values (1, 4, 4, 5, '2019-11-02')
insert into faixa_playlist values (2, 1, 1, 50, '2019-11-06')

insert into periodo_musical values (1, '2000-01-01', NULL, 'funk')
insert into periodo_musical values (2, '2001-04-05', NULL, 'metal')
insert into periodo_musical values (3, '2005-11-11', NULL, 'rap')
insert into periodo_musical values (4, '2008-08-03', NULL, 'forro')

insert into compositor values (1, 1, '2001-01-01', null, 'Brasil', 'SP', 'Safadao')
insert into compositor values (2, 2, '2011-02-12', null, 'Inglaterra', 'London', 'Metallica')
insert into compositor values (3, 3, '2013-03-01', null, 'Franca', 'Paris', 'Gerald')
insert into compositor values (4, 4, '2017-08-15', null, 'Brasil', 'Rio', 'Joe')

insert into faixa_compositor values (1, 2, 3)
insert into faixa_compositor values (2, 4, 4)
