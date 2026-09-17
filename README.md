Assignment 2. Factory Method and Abstract Factory

Theme: Smart-Home Hub.

Part A (factorymethod): Factory Method. DeviceInstaller declares createDevice() and has the business method install(room). LampInstaller, ThermostatInstaller and CameraInstaller override createDevice() and return Lamp, Thermostat or Camera. The client works with the Device interface only.

Part B (abstractfactory): Abstract Factory. SmartHomeFactory creates a family of three products: Sensor, Controller and MobileApp. NordicFactory and SolarisFactory each return products of their own vendor. SmartHomeHub receives the factory through the constructor and uses only the interfaces. The vendor is selected in one place, AbstractFactoryDemo.selectFactory().

How to run:

javac -d out src/factorymethod/*.java src/abstractfactory/*.java
java -cp out factorymethod.FactoryMethodDemo
java -cp out abstractfactory.AbstractFactoryDemo
java -cp out abstractfactory.AbstractFactoryDemo solaris
