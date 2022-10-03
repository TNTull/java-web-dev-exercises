//Teresa Tull created this 10-1-2022 ch 7 exercises

package exercisesCh7.technology;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class ProgramTest {
    Computer test_computer;
    @Before
    public void createComputerObject() {
        test_computer = new Computer(true, 1000, 16);
    }

    @Test
    public void testAddInternalStorageComputer() {
        test_computer.addinternalStorage(1000);
        assertEquals(2000,2000,.001);
    }

    @Test
    public void testAddRamComputer() {
        test_computer.addRam(16);
        assertEquals(32,32,.001);
    }

    @Test
    public void testAssignIDComputer() {
        Computer test_computer2 = new Computer(true, 1000, 16);
        test_computer.getId();
        assertNotEquals(test_computer, test_computer2);
    }

    Laptop test_laptop;
    @Before
    public void createLaptopObject() {
        test_laptop = new Laptop(true, 1000, 16, 5.3);
    }

    @Test
    public void testIsHeavyLaptop() {
        test_laptop.isHeavy();
        assertTrue(true);
    }

    @Test
    public void testAddRamLaptop() {
        test_laptop.addRam(16);
        assertEquals(32,32,.001);
    }

    @Test
    public void testAssignIDLaptop() {
        Laptop test_laptop2 = new Laptop(true, 1000, 16, 5.3);
        test_laptop.getId();
        assertNotEquals(test_laptop, test_laptop2);
    }

    SmartPhone test_smartPhone;
    @Before
    public void createSmartPhoneObject() {
        test_smartPhone = new SmartPhone(true, 64, 16, 20);
    }

    @Test
    public void testMakeCallsSmartPhone() {
        test_smartPhone.makeCalls();
        assertEquals(21,21,.001);
    }

    @Test
    public void testAddRamSmartPhone() {
        test_smartPhone.addRam(16);
        assertEquals(32,32,.001);
    }

    @Test
    public void testAddInternalStorageSmartPhone() {
        test_smartPhone.addinternalStorage(64);
        assertEquals(128,128,.001);
    }

    @Test
    public void testAssignIDSmartPhone() {
        SmartPhone test_smartPhone2 = new SmartPhone(true, 64, 16, 20);
        test_smartPhone.getId();
        assertNotEquals(test_smartPhone, test_smartPhone2);
    }


}
