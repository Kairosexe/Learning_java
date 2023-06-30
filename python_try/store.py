# 'producto' : precio , cantidad , vendido, comprado
producto = {'pollo': [24, 100, 0, 0], 'papa': [17, 100, 0, 0],
            'queso': [157, 100, 0, 0], 'tosino': [92, 100, 0, 0], 'aceite': [57, 100, 0, 0]}
# id de ticket - producto -  cuanto de cada producto se tomó -
tickets = {}
# NOTA DE LOS DICCIONARIOS:
# - Existe un método llamado get() que recibe dos argumentos la clave que se desea buscar en el diccionario y un valor por defecto
# - Se utiliza el método list con las funciones keys(), values() e items() para poder usarlo


def carrito():
    """
    Método que muestra las acciones que están disponibles en este modulo

    Este método simula una sentencia switch con un diccionario con cada una de las
    funciones dentro del modulo, repetira la impresion del menú hasta ingresar 5 como opción. 
    """
    switch = {
        1: comprar,
        2: vender,
        3: tabla_productos,
        4: ver_tickets,
        5: mensaje_despedia
    }

    opcion = 0
    while opcion != 5:
        print("BIENVENIDO A MI CARRITO DE COMPRAS:\n ¿Que desea hacer hoy?\n1) Ingresar productos \n2) Vender productos\n3) Ver los productos\n4) Ver tickets\n5) SALIR")
        opcion = int(input())
        if opcion in switch:
            funcion = switch[opcion]
            funcion()
        else:
            print("Ingrese una opción valida")


def mensaje_despedia():
    """
    Solo imprime un mensaje de despedida
    """
    print("Gracias por usar nuestro programa :)\n\tADIOS")


def ver_tickets():
    print("algo")


def tabla_productos():
    """
    Método que imprime una tabla del diccionario 'productos'
    """
    print("Producto\tPrecio \tCantidad Vendido Comprado")
    for key, value in producto.items():
        print("- %s \t\t" % (key), "\t".join(str(x)for x in value))


def enum_producto():
    """
    Método que ayuda a listar los elementos del diccionario producto para ser impresos como opciones en terminal.

    El método usa la longitud de 'producto' y crea una lista temporal que inicializa todos los valores con 0,
    luego recorre la lista de llaves de 'producto' para asignarlos como valores en un "orden" para luego listarlos en terminal.

    Returns:
        dict{}: un diccionario con lo siguiente {num_producto: 'nombre_producto'}

    """
    num_producto = {}
    rango = len(producto)
    for key in range(rango):
        num_producto.update({key: 0})
    for value in producto.keys():
        rango -= 1
        num_producto[rango] = value

    print("Seleccione el producto que desea: ")
    for key, value in num_producto.items():
        print("%d) %s" % (key, value))
    return num_producto


def vender():
    """
    Método para generar una venta de los productos disponibles en el diccionario.

    Este método usa la función enum_producto() para enlistar los productos
    esto ofrece una vista más agradable al usuario para identificar el producto a vender
    disminuye la cantidad_producto y aumenta la cantidad de ventas dentro de la lista de valores en el diccionario.

    """
    e = 0
    # Nueva diccionario en orden de los elementos disponibles
    lista_orden = enum_producto()
    while e != 1:
        seleccion = int(input())
        # Comprueba que se ingrese una de las opciones disponibles creadas con el nuevo diccionario.
        if seleccion in list(lista_orden.keys()):

            # Manera de seleccionar los productos por número
            # Al tener el valor del nombre del producto como valor en
            # la núeva lista se ingresa solo el número de elemento que se desea
            # y como resultado ingresará al producto que se busca.
            # print(producto[lista_orden[seleccion]])

            cantidad = float(input("Ingrese la cantidad que desea vender: "))
            # al asignar de esta manera la lista se hace una referencia explicita lo cual
            # afecta también a la lista original
            valores = producto.get(lista_orden[seleccion])
            # Comprueba la cantidad que se necesita vender
            if cantidad > valores[1]:
                print("No contamos con los productos suficientes")
            else:
                # Disminuye la cantidad de elementos existentes
                valores[1] -= cantidad
                # Aumenta la cantidad de elementos vendidos
                valores[2] += cantidad

                print("Se vendio: %d de %s  \n\tTotal $%d " %
                      (cantidad, lista_orden[seleccion], valores[0]*cantidad))
                # Termina el ciclo
                e = 1
        else:
            print("Ingrese una opción valida: ")


def comprar():
    """
    Método para generar una compra de producto disponibles en el diccionario.

    Este método usa el método enum producto para enlistar los elemtentos en un
    menú más accesible para el usuario, con el núevo diccionario se puede buscar el 
    elemento por su nombre sin tener que escribirlo.
    """
    e = 0
    lista_orden = enum_producto()
    while e != 1:
        seleccion = int(input())
        if seleccion in list(lista_orden.keys()):
            cantidad = float(
                input("Ingrese la cantidad que desea reabastecer: "))
            valores = producto.get(lista_orden[seleccion])
            # Incrementa la cantidad de productos disponibles
            valores[1] += cantidad
            # Incrementa la cantidad de productos comprados
            valores[3] += cantidad

            print("Se reabastecio: %d de %s" %
                  (cantidad, lista_orden[seleccion]))
            e = 1
        else:
            print("Ingrese una opción valida: ")


carrito()
