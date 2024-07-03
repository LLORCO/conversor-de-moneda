# Conversor de Moneda

Este es un programa en Java que permite realizar conversiones entre varias monedas utilizando la API de ExchangeRate-API.

## Funcionalidades

- Conversión de las siguientes monedas:
  - Dólar estadounidense (USD)
  - Peso Mexicano (MXN)
  - Real brasileño (BRL)
  - Peso colombiano (COP)

- Menú interactivo que permite al usuario elegir entre las siguientes opciones:
  1. Dólar =>> Peso Mexicano
  2. Peso Mexicano =>> Dólar
  3. Dólar =>> Real brasileño
  4. Real brasileño =>> Dólar
  5. Dólar =>> Peso colombiano
  6. Peso colombiano =>> Dólar
  7. Salir

- Se utiliza la biblioteca Gson para el manejo de JSON y HttpClient para realizar las consultas a la API de ExchangeRate-API.

## Requisitos

- Java 11 o superior
- Acceso a Internet para realizar las consultas a la API

## Uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java preferido (por ejemplo, IntelliJ IDEA).
3. Ejecuta la clase `Principal.java` para iniciar la aplicación.
4. Sigue las instrucciones en pantalla para realizar conversiones entre las monedas listadas.

## Cómo funciona

El programa utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real entre las monedas seleccionadas. A continuación, realiza los cálculos necesarios para convertir la cantidad ingresada por el usuario de una moneda a otra.

## Ejemplo de código

El código se divide en tres clases principales:

- **Principal.java**: Contiene el método `main` donde se encuentra la lógica principal de la aplicación, incluyendo la interfaz de usuario y las llamadas a la clase `ConsultaMoneda`.
- **ConsultaMoneda.java**: Realiza las consultas HTTP a la API de ExchangeRate-API y devuelve un objeto `Moneda` con las tasas de cambio.
- **Moneda.java y Valores.java**: Clases utilizadas para modelar la estructura de los datos obtenidos de la API mediante la biblioteca Gson.


## Autor

- Nombre: Jorge Luis Hernández Castellanos
- Contacto: jlhc1996@gmail.com

---
