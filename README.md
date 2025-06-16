# Grupo3Calidad - Actividad SOLID (Panadería)
Repositorio para la actividad integral sobre los principios SOLID, basado en un sistema de panadería.
- Proyecto base: Sistema de pedidos de panes con clase `PedidoPan` que viola SOLID.
- Integrantes: [Gustavo Caicedo, Ismael Corrales, Alejandro Haro, Wilsón Lozada].


## Principio de Responsabilidad Única (SRP)
**Aplicación**: Dividimos `PedidoPan` en `PedidoPan` (datos), `CalculadorPedido` (cálculo), `GeneradorFactura` (facturación detallada), `ServicioCorreo` (notificaciones con validación de correo), y `ServicioBaseDatos` (almacenamiento). Añadimos validaciones robustas.
**Problemas resueltos**: Código modular, fácil de mantener, con manejo de errores y facturas claras.

## Principio de Abierto/Cerrado (OCP)
**Aplicación**: Implementamos `EstrategiaDescuento` y `EstrategiaCostoAdicional` para manejar descuentos y costos de envío. Usamos streams para cálculos.
**Problemas resueltos**: Código extensible para nuevos descuentos o tipos de pedidos sin modificar clases existentes.


## Principio de Sustitución de Liskov (LSP)
**Aplicación**: Convertimos `Pan` en interfaz y aseguramos que `PanRegular` y `PanSinGluten` sean sustituibles, con precios ajustados dinámicamente.
**Problemas resueltos**: Evitamos excepciones y garantizamos comportamiento consistente.

## Principio de Segregación de Interfaces (ISP)
**Aplicación**: Dividimos `ProcesadorPedido` en `Calculable`, `Facturable`, `Notificable` y `Persistible` para que cada clase implemente solo lo necesario.
**Problemas resueltos**: Código más claro y sin métodos innecesarios.

## Principio de Inversión de Dependencias (DIP)
**Aplicación**: `CalculadorPedido` depende de las abstracciones `EstrategiaDescuento` y `EstrategiaCostoAdicional`, con configuración dinámica según el pedido.
**Problemas resueltos**: Código flexible y reutilizable para nuevas estrategias.
