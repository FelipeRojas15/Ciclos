# Clases de Equivalencia 


|                |Clase de equivalencia (en lenguaje natural o matemático)                       |Resultado correcto / incorrecto                       |
|----------------|-------------------------------|-----------------------------|
|1|`Edad >= 18 &&  died = False`           |Correcto - Se puede registrar|
|2 |`Edad < 18 && died = False`            |Incorrecto - No tiene la edad suficiente|
|3|`Edad >= 18 && died = False && id in registrados `|Incorrecto - La identidad esta duplicada|
|4|`Edad > 18 && died = True`|Incorrecto - La persona esta muerta|
|5|`Edad < 18 &&  died = True`|  Incorrecto - La persona esta muerta|

Especificaciones que tendremos en cuenta a la hora de hacer las prueba 
##  Caso 1
 *Limite izquierdo Edad* : 17
> _Resultado limite izquierdo_ = No se puede registrar
>  *Limite derecho Edad* : 19
>  _Resultado limite derecho_= Se puede registrar
>  *Limite medio Edad* : 18
>   _Resultado limite medio_= Se puede registrar
>  *Valor Died* : False

##  Caso 2
> *Limite izquierdo Edad* : 16
> _Resultado limite izquierdo_ = No se puede registrar
>  *Limite derecho Edad* : 18
>  _Resultado limite derecho= Si se puede registrar
>  *Limite medio Edad* : 17
>  _Resultado limite medio= No se puede registrar
>  *Valor Died* : False
>  
 ## Caso 3
>
>
