# Grupo3Calidad - Actividad Integral sobre los Principios SOLID (Sistema de Panadería)

## Descripción
Este repositorio contiene la **Actividad Integral sobre los Principios SOLID** desarrollada por el **Grupo3Calidad** como parte de un curso de calidad de software. El proyecto implementa un sistema de gestión de pedidos para una panadería, desarrollado en **Java** utilizando **IntelliJ IDEA** y **Maven**. El objetivo principal fue diseñar un sistema base que intencionalmente violara los principios SOLID (Responsabilidad Única, Abierto/Cerrado, Sustitución de Liskov, Segregación de Interfaces, Inversión de Dependencias), refactorizarlo aplicando cada principio con mejoras avanzadas, y documentar el proceso mediante capturas de pantalla y reflexiones. Este trabajo demuestra cómo los principios SOLID mejoran la modularidad, extensibilidad y mantenibilidad del software.

**Integrantes**:  
- Gustavo Caicedo  
- Ismael Corrales  
- Alejandro Haro  
- Wilson Lozada  

**Fecha**: 15 de Junio 2025  
**Captura del Sistema Base**: [screenshots/base.png](screenshots/base.png)

## Objetivos del Proyecto
- Crear un sistema de panadería que gestione pedidos, incluyendo panes, clientes, cálculos de totales, facturación, notificaciones y almacenamiento.
- Identificar violaciones de los principios SOLID en el sistema base.
- Refactorizar el sistema aplicando cada principio SOLID con validaciones robustas y diseño avanzado.
- Documentar el proceso con capturas de pantalla y reflexiones individuales.
- Entregar un repositorio organizado y una reflexión en Brightspace.

## Estructura del Proyecto
- **src/main/java/com/grupo3calidad/panaderia**: Contiene el código fuente del sistema, organizado en clases para panes, clientes, pedidos y servicios.
- **screenshots**: Carpeta con capturas de pantalla de la ejecución del sistema base y cada refactorización.
- **pom.xml**: Archivo de configuración de Maven para dependencias y compilación.
- **DOCUMENTACION.md**: Documentación detallada del proyecto (en el repositorio).

## Resumen de los Principios SOLID Aplicados

| Principio | Descripción | Aplicación en el Proyecto | Beneficio | Captura |
|-----------|-------------|---------------------------|-----------|---------|
| **SRP** | Cada clase tiene una sola responsabilidad. | Se separaron las funciones de la clase de pedidos en clases específicas para datos, cálculo, facturación, notificaciones y almacenamiento, con validaciones robustas. | Código modular, fácil de mantener y probar. | [screenshots/srp.png](screenshots/srp.png) |
| **OCP** | Abierto para extensión, cerrado para modificación. | Se implementaron interfaces para estrategias de descuento y costos adicionales, permitiendo nuevas funcionalidades sin modificar el código existente. | Sistema extensible y mantenible. | [screenshots/ocp.png](screenshots/ocp.png) |
| **LSP** | Subclases sustituibles por su clase base. | Se diseñó una interfaz para panes con implementaciones para panes regulares y sin gluten, asegurando sustituibilidad. | Comportamiento consistente y fiable. | [screenshots/lsp.png](screenshots/lsp.png) |
| **ISP** | Interfaces específicas para cada cliente. | Se crearon interfaces separadas para cálculo, facturación, notificación y almacenamiento, evitando métodos innecesarios. | Código claro y enfocado. | [screenshots/isp.png](screenshots/isp.png) |
| **DIP** | Depender de abstracciones, no de implementaciones. | Se usó inyección de dependencias para que la clase de cálculo dependa de interfaces, con configuración dinámica. | Código flexible y reutilizable. | [screenshots/dip.png](screenshots/dip.png) |

## Instrucciones para Ejecutar el Proyecto
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Alex-Caicedo-R384/Grupo3Calidad-SOLID.git

2. Abre el proyecto en IntelliJ IDEA.

3. Configura el JDK 17 en Archivo > Estructura del Proyecto > SDKs.

4. Ejecuta la clase Main ubicada en src/main/java/com/grupo3calidad/panaderia para probar el sistema.

5. Revisa las capturas en la carpeta screenshots para ver los resultados de cada etapa.

## Reflexión General
La aplicación de los principios SOLID transformó el sistema de panadería en uno más robusto, modular y preparado para evolucionar. SRP redujo la complejidad al separar responsabilidades, OCP permitió añadir funcionalidades sin modificar código, LSP garantizó consistencia en los tipos de pan, ISP mejoró la claridad de las interfaces, y DIP aumentó la flexibilidad con abstracciones. Este proceso demostró cómo un diseño bien fundamentado en SOLID mejora la calidad del software y facilita su mantenimiento a largo plazo.

## Entregables
Repositorio GitHub: Incluye el código refactorizado, capturas de pantalla, documentación y este README.

Reflexión Individual: Cada integrante subió un documento a Brightspace respondiendo:
¿Cuál fue el principio más desafiante de aplicar? ¿Por qué?

¿Cómo crees que SOLID mejora el diseño de software?

¿Qué principio SOLID aplicarías en futuros proyectos?

## Agradecimientos
Agradecemos al docente y a la institución por la oportunidad de aplicar los principios SOLID en un proyecto práctico, así como al equipo Grupo3Calidad por su colaboración y compromiso.

## Licencia
Este proyecto tiene fines educativos y no está destinado a uso comercial. Todo el contenido está disponible para revisión académica.
