SELECT DISTINCT(p.nome)
FROM faixa_playlist fp
INNER JOIN playlist p ON (p.id = fp.id_playlist)
WHERE ((SELECT count(*) FROM faixa_playlist fpp WHERE fpp.id_playlist = p.id GROUP BY fpp.id_playlist) 
- (SELECT COUNT(*)
FROM faixa f
INNER JOIN tipo_composicao tc ON (tc.id = f.id_tipo_composicao)
INNER JOIN faixa_compositor fc ON (f.num_faixa = fc.num_faixa and f.id_album = fc.id_album)
INNER JOIN compositor c ON (c.id_compositor = fc.id_compositor)
INNER JOIN periodo_musical pm ON (c.id_periodo = pm.id)
INNER JOIN faixa_playlist fppp ON (f.num_faixa = fppp.num_faixa AND f.id_album = fppp.id_album)
where fppp.id_playlist = p.id  AND tc.descricao like '_oncerto' AND pm.descricao LIKE '_arroco'
group by fppp.id_playlist)
) = 0