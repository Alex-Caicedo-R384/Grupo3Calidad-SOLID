# Grupo3Calidad - Actividad SOLID (Panadería)
Repositorio para la actividad integral sobre los principios SOLID, basado en un sistema de panadería.
- Proyecto base: Sistema de pedidos de panes con clase `PedidoPan` que viola SOLID.
- Integrantes: [Gustavo Caicedo, Ismael Corrales, Alejandro Haro, Wilsón Lozada].


## Principio de Responsabilidad Única (SRP)
**Aplicación**: Dividimos `PedidoPan` en `PedidoPan` (datos), `CalculadorPedido` (cálculo), `GeneradorFactura` (facturación detallada), `ServicioCorreo` (notificaciones con validación de correo), y `ServicioBaseDatos` (almacenamiento). Añadimos validaciones robustas.
**Problemas resueltos**: Código modular, fácil de mantener, con manejo de errores y facturas claras.