# Grupo3Calidad - Actividad Integral sobre los Principios SOLID (Sistema de Panadería)

## Descripción
Este repositorio contiene la **Actividad Integral sobre los Principios SOLID** realizada por el **Grupo3Calidad**. El proyecto implementa un sistema de gestión de pedidos para una panadería en Java, usando IntelliJ IDEA y Maven. El objetivo fue desarrollar un sistema base que violara los principios SOLID, refactorizarlo aplicando cada principio (SRP, OCP, LSP, ISP, DIP) con mejoras avanzadas, y documentar el proceso con capturas de pantalla.

**Integrantes**: [Nombres de los miembros del grupo]  
**Fecha**: Junio 2025  
**Captura del Sistema Base**: [screenshots/base.png](screenshots/base.png)

## Estructura del Proyecto
- **src/main/java/com/grupo3calidad/panaderia**: Código fuente del sistema.
- **screenshots**: Capturas de pantalla de cada etapa.
- **pom.xml**: Configuración de Maven.

## Principios SOLID Aplicados

### 1. Principio de Responsabilidad Única (SRP)
**Descripción**: Cada clase debe tener una sola responsabilidad.  
**Aplicación**: Se dividió la clase de pedidos en clases separadas para gestionar datos, calcular totales, generar facturas, enviar notificaciones y almacenar datos. Se añadieron validaciones robustas para tipos de pedido, correos y precios.  
**Beneficio**: Código modular, fácil de mantener y probar.  
**Captura**: [screenshots/srp.png](screenshots/srp.png)

### 2. Principio de Abierto/Cerrado (OCP)
**Descripción**: Las clases deben estar abiertas para extensión y cerradas para modificación.  
**Aplicación**: Se crearon interfaces para estrategias de descuento y costos adicionales, permitiendo añadir nuevos descuentos o costos sin modificar el código. Se usaron streams para cálculos elegantes.  
**Beneficio**: Sistema extensible y mantenible.  
**Captura**: [screenshots/ocp.png](screenshots/ocp.png)

### 3. Principio de Sustitución de Liskov (LSP)
**Descripción**: Las subclases deben ser sustituibles por su clase base.  
**Aplicación**: Se diseñó una interfaz para panes, con implementaciones para panes regulares y sin gluten (con precios ajustados). Se garantizó sustituibilidad sin errores.  
**Beneficio**: Comportamiento consistente y fiable.  
**Captura**: [screenshots/lsp.png](screenshots/lsp.png)

### 4. Principio de Segregación de Interfaces (ISP)
**Descripción**: Los clientes no deben implementar interfaces que no usan.  
**Aplicación**: Se crearon interfaces específicas para cálculo, facturación, notificación y almacenamiento, evitando métodos innecesarios.  
**Beneficio**: Código claro y enfocado.  
**Captura**: [screenshots/isp.png](screenshots/isp.png)

### 5. Principio de Inversión de Dependencias (DIP)
**Descripción**: Depender de abstracciones, no de implementaciones concretas.  
**Aplicación**: La clase de cálculo usa inyección de dependencias para depender de interfaces de estrategias, con configuración dinámica según el pedido.  
**Beneficio**: Código flexible y reutilizable.  
**Captura**: [screenshots/dip.png](screenshots/dip.png)

## Instrucciones para Ejecutar
1. Clona el repositorio: `git clone https://github.com/tu-usuario/Grupo3Calidad-SOLID-Panaderia.git`.
2. Abre el proyecto en IntelliJ IDEA.
3. Configura el JDK 17 en **Archivo > Estructura del Proyecto > SDKs**.
4. Ejecuta la clase `Main` para probar el sistema.

## Reflexión
Los principios SOLID transformaron el sistema de panadería en uno modular, extensible y robusto. Cada principio resolvió problemas específicos, desde la complejidad excesiva (SRP) hasta la falta de flexibilidad (OCP, DIP), mejorando la calidad del diseño.

## Licencia
Este proyecto es para fines educativos y no tiene licencia comercial.
