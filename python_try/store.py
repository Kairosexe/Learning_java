# 'producto' : precio , cantidad , vendido, comprado
producto = {'pollo': [24, 100, 0, 0], 'papa': [17, 100, 0, 0],
            'queso': [157, 100, 0, 0], 'tosino': [92, 100, 0, 0], 'aceite': [57, 100, 0, 0]}
# id de ticket - producto -  cuanto de cada producto se tomó -
# tickets = {}
# NOTA DE LOS DICCIONARIOS:
# - Existe un método llamado get() que recibe dos argumentos la clave que se desea buscar en el diccionario y un valor por defecto
# - Se utiliza el método list con las funciones keys(), values() e items() para poder usarlo


def carrito():
    switch = {
        1: comprar,
        2: vender,
        3: tabla_productos,
        4: ver_tickets,
        5: mensaje_despedia
    }
    # func = switch.get(case, default_case)
    # func()
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
    print("Gracias por usar nuestro programa :)\n\tADIOS")


def ver_tickets():
    print("algo")


def tabla_productos():
    print("Producto\tPrecio \tCantidad Vendido Comprado")
    for key, value in producto.items():
        print("- %s \t\t" % (key), "\t".join(str(x)for x in value))


def enum_producto():
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
    e = 0
    lista_orden = enum_producto()
    while e != 1:
        seleccion = int(input())
        if seleccion in list(lista_orden.keys()):

            # Manera de seleccionar los productos por número
            # print(producto[lista_orden[seleccion]])

            cantidad = float(input("Ingrese la cantidad que desea vender: "))
            # al asignar de esta manera la lista se hace una referencia explicita lo cual
            # afecta también a la lista original
            valores = producto.get(lista_orden[seleccion])
            if cantidad > valores[1]:
                print("No contamos con los productos suficientes")
            else:
                valores[1] -= cantidad
                valores[2] += cantidad
                # print(lista_orden[seleccion])
                print("Se vendio: %d de %s  \n\tTotal $%d " %
                      (cantidad, lista_orden[seleccion], valores[0]*cantidad))
                # print(producto[lista_orden[seleccion]])
                e = 1
        else:
            print("Ingrese una opción valida: ")


def comprar():
    e = 0
    lista_orden = enum_producto()
    # print(lista_orden)
    # print("Seleccione el producto que desea vender")
    # for key, value in lista_orden.items():
    #     print("%d) %s" % (key, value))
    while e != 1:
        seleccion = int(input())
        if seleccion in list(lista_orden.keys()):
            # Manera de seleccionar los productos por número
            # print(producto[lista_orden[seleccion]])
            cantidad = float(
                input("Ingrese la cantidad que desea reabastecer: "))
            valores = producto.get(lista_orden[seleccion])
            valores[1] += cantidad
            valores[3] += cantidad
            # print(lista_orden[seleccion])
            print("Se reabastecio: %d de %s" %
                  (cantidad, lista_orden[seleccion]))
            # print(producto[lista_orden[seleccion]])
            e = 1
        else:
            print("Ingrese una opción valida: ")


def default_case():
    print("Eliga una opción valida")


carrito()
# tabla_productos()
# comprar()
