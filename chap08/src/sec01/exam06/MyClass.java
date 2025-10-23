package sec01.exam06;

public class MyClass {
    RemoteControl rc = new Television();

    MyClass() {
    }

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
}
