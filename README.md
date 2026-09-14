# Assignment 2. Factory Method & Abstract Factory

**Theme: Smart-Home Hub** (from the approved list).

- Part A (Factory Method): install one **Device** - Lamp, Thermostat or Camera.
- Part B (Abstract Factory): a **vendor family** - Sensor + Controller + MobileApp that must all belong to the same vendor (Nordic or Solaris).

## Structure

```
src/
  factorymethod/        Part A
    Device.java               product interface
    Lamp.java                 concrete products
    Thermostat.java
    Camera.java
    DeviceInstaller.java      abstract creator: createDevice() + install(room)
    LampInstaller.java        concrete creators
    ThermostatInstaller.java
    CameraInstaller.java
    FactoryMethodDemo.java    client
  abstractfactory/      Part B
    Sensor.java               abstract products
    Controller.java
    MobileApp.java
    SmartHomeFactory.java     abstract factory
    NordicFactory.java        concrete factories
    SolarisFactory.java
    Nordic*.java              Nordic family
    Solaris*.java             Solaris family
    SmartHomeHub.java         client, gets the factory by constructor
    AbstractFactoryDemo.java  the only place where the family is selected
```

## How to run

```
javac -d out src/factorymethod/*.java src/abstractfactory/*.java
java -cp out factorymethod.FactoryMethodDemo
java -cp out abstractfactory.AbstractFactoryDemo
java -cp out abstractfactory.AbstractFactoryDemo solaris
```

## Output

```
=== Part A: Factory Method ===
Lamp installed in living room: light is on, brightness 70%
Thermostat installed in bedroom: heating to 22 C
Camera installed in hallway: recording in 1080p

=== Part B: Abstract Factory ===
Nordic app (dark theme): Nordic controller got [Nordic sensor: 19 C] and turned the heating on

=== Part B: Abstract Factory ===   (with argument "solaris")
Solaris app (light theme): Solaris controller got [Solaris sensor: 31 C] and turned the cooling on
```

## Part A. Factory Method

`DeviceInstaller` is the abstract creator. It declares the factory method
`createDevice()` and has the business method `install(room)` that works with
the product only through the `Device` interface. `LampInstaller`,
`ThermostatInstaller` and `CameraInstaller` override the factory method and
decide which concrete device to create. The client never writes `new Lamp()`.

Adding a new device (for example a Speaker) = one new product class and one
new installer subclass. `DeviceInstaller` and the client do not change.

## Part B. Abstract Factory

`SmartHomeFactory` has one create-method per product of the family:
`createSensor()`, `createController()`, `createApp()`. `NordicFactory` returns
only Nordic products, `SolarisFactory` only Solaris products, so it is
impossible to mix a Nordic sensor with a Solaris app.

`SmartHomeHub` receives the factory through the constructor (composition) and
uses only the interfaces. The vendor is chosen in exactly one place,
`AbstractFactoryDemo.selectFactory()`. To switch the whole house to another
vendor you change one line.

## Factory Method vs Abstract Factory

|                     | Factory Method (Part A)          | Abstract Factory (Part B)              |
|---------------------|----------------------------------|----------------------------------------|
| creates             | one product                      | a family of related products           |
| how the client gets it | inheritance: subclass overrides `createDevice()` | composition: factory object passed to the constructor |
| what one factory makes | 1 object                      | 3 objects that fit together            |
| add a new variant   | new subclass                     | new factory + one class per product    |
| add a new product kind | not applicable                | change the interface and every factory (weak spot) |
