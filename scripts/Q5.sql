create view PlaylistAlbuns_Vm (playlist, albuns)
with schemabinding
AS
	select nome as playlist, count(*) as albuns
	from dbo.faixa_playlist AS AFP inner join dbo.playlist as P
	on P.id = AFP.id_playlist
	group by P.nome