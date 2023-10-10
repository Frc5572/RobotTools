

## Usage

In `build.gradle`, add the following

```
repositories {
    mavenLocal()
    maven { url 'https://jitpack.io' }
}
```

Then add the following line in the dependencies block

```
annotationProcessor 'com.github.Frc5572:RobotTools:main-SNAPSHOT'
```
