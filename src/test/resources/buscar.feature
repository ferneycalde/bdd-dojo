Feature:
	como feligres
	quiero buscar por barrio
	para que el sistema me muestre las iglesias que se encuentrar en ese sector
	
Scenario:
	Given ingreso al buscador de iglesias
	When ingrese el barrio "Diamante" 
	And doy clic en el boton buscar
	Then debo ver la lista de iglesias de ese barrio
	
