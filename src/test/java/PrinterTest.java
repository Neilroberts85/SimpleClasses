import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

Printer printer;

@Before
    public void before(){
    printer = new Printer(50, 500);
}

@Test
    public void unsuccessfulPrint(){
    printer.print(10,6);
    assertEquals(50, printer.getPaperLeft());
    assertEquals(500, printer.getTonerLeft());
}

@Test
    public void successfulPrint(){
    printer.print(10,4);
    assertEquals(10, printer.getPaperLeft());
    assertEquals(460, printer.getTonerLeft());

}

}
