import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    println("Ingrese un numero  para entrar al menu")
    val option = Scanner.nextInt()
    while (option != 99) {
        println("Bienvenido")
        println("Por favor seleccione una opcion:")
        println("1. Operadores")
        println("2. Condicionales")
        println("3. Ciclos")

        val userOption = Scanner.nextInt()

        when (userOption) {
            1 -> {
                println("Has elegido la opcion de operadores.")
                println("1. Calcular el área de un Triángulo")
                println("2. Suma de dos números")
                println("3. Números elevados al cuadrado")
                println("4. Conversión de euros a dólares")
                println("5. Lado de un cuadrado y cálculo de área y perímetro")
                println("6. Área y volumen de un cilindro")
                println("7. Radio de una circunferencia")
                println("8. Promedio de 3 números")
                println("99. Salir")
                val userOp = Scanner.nextInt()
                when (userOp) {
                    1 -> {
                        println("Ingrese la base del triángulo:")
                        val base = Scanner.nextDouble()
                        println("Ingrese la altura del triángulo:")
                        val altura = Scanner.nextDouble()
                        val areaTriangulo = base * altura / 2
                        println("El área del triángulo es: $areaTriangulo")
                    }

                    2 -> {
                        println("\nPunto 1.2:")
                        println("Ingrese el primer número:")
                        val num1 = Scanner.nextDouble()
                        println("Ingrese el segundo número:")
                        val num2 = Scanner.nextDouble()
                        val suma = num1 + num2
                        println("La suma de los dos números es: $suma")

                    }

                    3 -> {
                        println("Ingrese un número:")
                        val num = Scanner.nextDouble()
                        val cuadrado = num * num
                        println("El número elevado al cuadrado es: $cuadrado")
                    }

                    4 -> {
                        println("Ingrese la cantidad de euros:")
                        val euros = Scanner.nextDouble()
                        val tasaCambio = 1.17 // Tasa de cambio a dólares
                        val dolares = euros * tasaCambio
                        println("$euros euros equivalen a $dolares dólares")
                    }

                    5 -> {
                        println("Ingrese el lado del cuadrado:")
                        val lado = Scanner.nextDouble()
                        val areaCuadrado = lado * lado
                        val perimetroCuadrado = 4 * lado
                        println("El área del cuadrado es: $areaCuadrado")
                        println("El perímetro del cuadrado es: $perimetroCuadrado")
                    }

                    6 -> {
                        println("Ingrese el radio del cilindro:")
                        val radio = Scanner.nextDouble()
                        println("Ingrese la altura del cilindro:")
                        val alturaCilindro = Scanner.nextDouble()
                        val areaCilindro = 2 * radio * (radio + alturaCilindro)
                        val volumenCilindro = radio * radio * alturaCilindro
                        println("El área del cilindro es: $areaCilindro")
                        println("El volumen del cilindro es: $volumenCilindro")
                    }

                    7 -> {
                        println("Ingrese el radio de la circunferencia:")
                        val radioCircunferencia = Scanner.nextDouble()
                        val longitudCircunferencia = 2 * radioCircunferencia
                        val areaCirculo = Math.PI * radioCircunferencia * radioCircunferencia
                        println("La longitud de la circunferencia es: $longitudCircunferencia")
                        println("El área del círculo inscrito es: $areaCirculo")
                    }

                    8 -> {
                        println("Ingrese el primer número:")
                        val numero1 = Scanner.nextDouble()
                        println("Ingrese el segundo número:")
                        val numero2 = Scanner.nextDouble()
                        println("Ingrese el tercer número:")
                        val numero3 = Scanner.nextDouble()
                        val promedio = (numero1 + numero2 + numero3) / 3
                        println("El promedio de los tres números es: $promedio")
                    }

                    99 -> {
                        println("Saliendo del programa...")
                    }


                    else -> {
                        println("Opcion invalida.")
                    }
                }
            }

            2 -> {
                println("Has elegido la opcion de condicionales.")
                println("1. Numero es positivo o negativo")
                println("2. numeros mayores o menores")
                println("3. números enteros positivos, menor y el mayor de ellos")
                println("4. numeros A y B")
                println("5. Cociente de numeros ")
                println("6. Suma o multiplicaion de numeros positivos o negativos ")
                println("7. Definir si un año bisiesto o no")
                println("99. Salir")
                println("Selecciona la opción que deseas: ")
                val userConditionals = Scanner.nextInt()
                when (userConditionals) {
                    1 -> {
                        println("Ingrese un número:")
                        val numero = Scanner.nextDouble()
                        if (numero > 0) {
                            println("El número es positivo.")
                        } else if (numero < 0) {
                            println("El número es negativo.")
                        } else {
                            println("El número es cero.")
                        }
                    }

                    2 -> {
                        println("Ingrese el primer número:")
                        val a = Scanner.nextDouble()
                        println("Ingrese el segundo número:")
                        val b = Scanner.nextDouble()
                        if (a > b) {
                            println("$a es el mayor y $b es el menor.")
                        } else if (a < b) {
                            println("$b es el mayor y $a es el menor.")
                        } else {
                            println("Ambos números son iguales.")
                        }

                    }

                    3 -> {
                        println("Ingrese el primer número:")
                        val numA = Scanner.nextInt()
                        println("Ingrese el segundo número:")
                        val numB = Scanner.nextInt()
                        println("Ingrese el tercer número:")
                        val numC = Scanner.nextInt()
                        val mayor = maxOf(numA, numB, numC)
                        val menor = minOf(numA, numB, numC)
                        println("El número mayor es: $mayor")
                        println("El número menor es: $menor")
                    }

                    4 -> {
                        println("Ingrese el número A:")
                        val A = Scanner.nextInt()
                        println("Ingrese el número B:")
                        val B = Scanner.nextInt()
                        val sumOrSubtract = if (A < B) A + B else A - B
                        println("El resultado es: $sumOrSubtract")

                    }

                    5 -> {
                        println("Ingrese el número A:")
                        val numA2 = Scanner.nextDouble()
                        println("Ingrese el número B:")
                        val numB2 = Scanner.nextDouble()
                        if (numB2 != 0.0) {
                            val cociente = numA2 / numB2
                            println("El cociente entre A y B es: $cociente")
                        } else {
                            println("La división no es posible (B es igual a 0)")
                        }
                    }

                    6 -> {
                        println("Ingrese el número A:")
                        val numA3 = Scanner.nextDouble()
                        println("Ingrese el número B:")
                        val numB3 = Scanner.nextDouble()
                        val result = if (numA3 < 0 || numB3 < 0) numA3 + numB3 else numA3 * numB3
                        println("Resultado: $result")
                    }

                    7 -> {
                        println("Ingrese el radio de la circunferencia:")

                    }

                    99 -> {
                        println("Saliendo del programa...")
                    }

                    else -> {
                        println("Opcion invalida.")
                    }
                }
            }


            3 -> {
                println("Has elegido la opcion de ciclos.")
                println("1. Multiplos de 3 de 1 a 100")
                println("2. Impares de 0 a 100")
                println("3. Pares de 1 a 100 ")
                println("4. Cuadros de 1 a 30")
                println("5. Suma de los numeros naturales de al cuadrado ")
                println("6. Suma o multiplicaion de numeros positivos o negativos ")
                println("99. Salir")
                println("Selecciona la opción que deseas: ")

                val userCycles = Scanner.nextInt()
                when (userCycles) {
                    1 -> {
                        println("Múltiplos de 3 entre 1 y 100:")
                        for (i in 1..100) {
                            if (i % 3 == 0)
                                print("$i ")
                        }
                    }

                    2 -> {
                        println("\nNúmeros impares entre 0 y 100:")
                        for (i in 1..100 step 2) {
                            print("$i ")
                        }
                    }

                    3 -> {
                        println("\nNúmeros pares entre 1 y 100:")
                        for (i in 2..100 step 2) {
                            print("$i ")
                        }
                    }

                    4 -> {
                        println("\nCuadrados de los números del 1 al 30:")
                        for (i in 1..30) {
                            print("${i * i} ")
                        }

                    }

                    5 -> {
                        var sum = 0

                        for (i in 1..100) {
                            sum += i * i
                        }

                        println("La suma de los cuadrados de los cien primeros números naturales es: $sum")
                    }


                    6 -> {

                        println("Ingrese el primer número:")
                        val num1 = readLine()?.toIntOrNull() ?: 0

                        println("Ingrese el segundo número (debe ser mayor que el primero):")
                        val num2 = readLine()?.toIntOrNull() ?: 0

                        if (num1 >= num2) {
                            println("El primer número debe ser menor que el segundo.")
                        } else {
                            println("Números comprendidos entre $num1 y $num2 en secuencia ascendente:")
                            for (i in num1..num2) {
                                print("$i ")
                            }
                        }
                    }

                    99 -> {
                        println("Saliendo del programa...")
                    }
                }
            }


            else -> {
                println("Opción invalida .")
            }
        }
    }
}





