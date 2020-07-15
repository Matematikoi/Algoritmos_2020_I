# Punto 1
## 1.2-2
si ponemos las ecuaciones en wolfram alpha nos damos cuenta de que la respuesta es 43.55, es decir que para numeros menores a 43 el polinomio <img src="https://render.githubusercontent.com/render/math?math=8 n^2"> es mejor que <img src="https://render.githubusercontent.com/render/math?math=64 n\log(n)"> y de 44 en adelante el opuesto es cierto
## 1.2-3
De nuevo si usamos wolfram para evaluar la igualdad nos damos cuenta que 
el polinomio es mayor que la exponencial en el intervalo <img src="https://render.githubusercontent.com/render/math?math=1 \leq n \leq 14 ">
en el resto de numeros naturales la exponencial es mayor al polinomio.
## 3-1 
a) Evidentemente es lo mismo a probar 

<img src="https://render.githubusercontent.com/render/math?math=| \lim_{x\to\infty} \frac{n^k}{p(n)} |> 0">

lo cual es obvio pues podemos multiplicar numerador y denominador por 
<img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^k}">  y hacer las fracciones de tipo <img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^m}"> tender a cero. 


b) Evidentemente es lo mismo a probar

<img src="https://render.githubusercontent.com/render/math?math=|\lim_{x\to\infty} \frac{n^k}{p(n)} | < \infty">


lo cual es obvio pues podemos multiplicar numerador y denominador por 
<img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^d}">  y hacer las fracciones de tipo <img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^m}"> tender a cero.  

c) basta usar el teorema 3-1 y los resultados a) b).

d) Evidentemente es lo mismo a probar

<img src="https://render.githubusercontent.com/render/math?math=|\lim_{x\to\infty} \frac{n^k}{p(n)} | = \infty">


lo cual es obvio pues podemos multiplicar numerador y denominador por 
<img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^k}">  y hacer las fracciones de tipo <img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^m}"> tender a cero.

e) Evidentemente es lo mismo a probar

<img src="https://render.githubusercontent.com/render/math?math=|\lim_{x\to\infty} \frac{n^k}{p(n)} | =0">


lo cual es obvio pues podemos multiplicar numerador y denominador por 
<img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^d}">  y hacer las fracciones de tipo <img src="https://render.githubusercontent.com/render/math?math=\frac{1}{n^m}"> tender a cero.

# Punto 2
## 0.1
| f = O(g) | f = Omega(g) | label |
|----------|--------------|-------|
| YES      | YES          | a     |
| YES      | NO           | b     |
| YES      | NO           | c     |
| YES      | YES          | d     |
| YES      | YES          | e     |
| NO       |  YES         | f     |
| NO       |YES           | g     |
| YES      |   NO         | h     |
|  YES     |  YES         | i     |
|   NO     |  YES         | j     |
|   YES    |  NO          | k     |
|   NO     | YES          | l     |
|    NO    |  YES         | m     |
|    NO    |  YES         | n     |

## 0.2
a) en este caso <img src="https://render.githubusercontent.com/render/math?math=g(n)=\frac{1-c^n}{1-c}"> cuando n tiene a infinito es facil ver que tiende a el inverso multiplicativo de (1-c) que es una constante. por tanto en notación theta mayuscula puede
limitarse a una mayuscula.

b) evidentemente g(n) = n por tanto es igual a si misma en notacion theta mayuscula.

c) Podemos usar limites en el numerador g(n) y en el denominador c elevado a la n. Si multiplicamos numerador y denominador por el inverso multiplicativo de c elevado a la n entonces el limite resulta constante como se quería demostrar.

# Punto 3
<img src="./solution_3.png">

# Punto 4

## naive primality test
worst case: O(sqrt(n))

best case:  O(sqrt(n))

average case: O(sqrt(n))

space complexity: O(1)

## binary search
worst case: O(log(n))

best case:  O(1)

average case: O(log(n))

space complexity: O(1)

## Finding smallest or largest element in unsorted array
worst case: O(n)

best case:  O(n)

average case: O(n)

space complexity: O(1)

## Kadane
worst case: O(n)

best case:  O(n)

average case: O(n)

space complexity: O(1)
## Criva de eratostenes
worst case: O(n log(n) (log log (n)))

best case:  O(n log(n) (log log (n)))

average case: O(n log(n) (log log (n)))

space complexity: O(n)
## merge sort
worst case: O(nlog(n))

best case:  O(nlog(n))

average case: O(nlog(n))

space complexity: O(n)
## quick sort
worst case: O(n^2)

best case:  O(nlog(n))

average case: O(n log(n)) (en caso que se parta en 3 sería O(n))

space complexity: O(n)
## Tim sort
worst case: O(nlog(n))

best case:  O(n)

average case: O(nlog(n))

space complexity: O(n)
## convex hull (D&C)
worst case: O(nlog(n))

best case:  O(nlog(n))

average case: O(nlog(n))

space complexity: O(n)
## Insertion Sort
worst case: O(n^2)

best case:  O(n)

average case: O(n^2)

space complexity: O(n)
## Dijkstra
siendo V la cantidad de nodos y E la cantidad de aristas
worst case: O((V+E) log(V))

best case:  O(1)

average case: O((V+E) log(V))

space complexity: O(V)
## Naive matrix multiplication
donde se multiplican matrices cuadradas de n columnas y n filas
worst case: O(n^3)

best case:  O(n^3)

average case: O(n^3)

space complexity: O(n^2)
## Calculate the permutations of n distinct elements without repetitions
worst case: O(n)

best case:  O(n)

average case: O(n)

space complexity: O(1)
## Calculate the permutations of n distinct elements with repetitions	
worst case: O(n)

best case:  O(n)

average case: O(n)

space complexity: O(1)