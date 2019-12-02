create INDEX Indice_Faixa_AlbumId 
on faixa (id_album)
	with (PAD_INDEX = ON, FILLFACTOR = 100)

create NONCLUSTERED INDEX Indice_secundario_TpCompos
on faixa(id_tipo_composicao)
	with (PAD_INDEX = ON, FILLFACTOR = 100)
