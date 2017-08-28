import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class testeValidacao {
    @Test
    public void complexo(){
        Complexo e1 = new Complexo();
        Complexo e2 = new Complexo(1,0);
        Complexo e3 = new Complexo(5,4);

        assertEquals("falha complexo"," (0,0) ",e1.toString());

        e2.soma(e1);
        assertEquals("Falha na soma"," (1,0) ",e2.toString());

        e3.subtracao(e2);
        assertEquals("Falha na subtração", " (4,4) ", e3.toString());
    }
}
