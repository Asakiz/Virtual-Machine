package ps;
import java.*;
import java.awt.List;
import java.lang.Object;
import java.util.LinkedList;
import java.util.Stack;
import static oracle.jrockit.jfr.events.Bits.intValue;
import UI.UI;
import java.util.ArrayList;
import static oracle.jrockit.jfr.events.Bits.shortValue;

public class controlUnit {
/*    
    ADD     Acc<-Acc + Opd1
    BR      PC <- Opd1
    BRNEG   PC <- Opd1, se ACC < 0
    BRPOS   PC <- Opd1, se ACC > 0
    BRZERO  PC <- Opd1, se ACC = 0
    CALL    [SP] <- PC ; PC <- Opd1
    COPY    Opd1 <- Opd2
    DIVIDE  ACC <- ACC/Opd1
    LOAD    ACC <- Opd1
    MULT    Acc <- Acc*Opd1
    READ    Opd1 <- input
    RET     PC <- [SP]
    STOP    FIM
    STORE   Opd1 <- ACC
    SUB     ACC <- ACC - Opd1
    WRITE   output <- Opd1
*/
    private UI ui = new UI();
    private short PC;
    private Stack<Short> SP = new Stack<Short>();
    private short ACC;
    private byte MOP;
    private short RI;
    private short RE;
    private short opd1;
    private short opd2;
    private short regA;
    public ArrayList<Integer> memoria = new ArrayList<Integer>(64);
    
    public void setACC(short value){
        ACC = value;
    }
    
    public short getACC(){
        return ACC;
    }
    
    public int getMemoria(int indice) {
        return memoria.get(indice);
    }

    public void setMemoria(int indice,short value) {
        memoria.add(indice,intValue(value));
    }

    public controlUnit(){
        ui.setVisible(true);
        ui.control=this;
    }
    
    public void clearMemory(){
         for(int i=0;i<64;i++){
            memoria.add(i, 0);
        }
    }
    
    public short getOpd2() {
        return opd2;
    }

    public void setOpd2(short opd2) {
        this.opd2 = opd2;
    }

    public short getOpd1() {
        return opd1;
    }

    public void setOpd1(short Opd1) {
        this.opd1 = Opd1;
    }

    private void incrementPC() {

            PC += 16;
    }

    public short getPC() {

            return PC;

    }

    private void push(short value) {
        SP.push(value);
    }

    private short pop() {

            return (short)SP.pop();
    }

    public void storeACC(short RESULTULA) {

            ACC = RESULTULA;
    }

    public void storeMOP(byte VARMOP) {

            MOP = VARMOP;
    }

    public void storeOPCODE(short OPCODE) {

            RI = OPCODE; 

    }

    public void storeRE(short VARRM) {

            RE = VARRM;
    }

    public void add() {

    ACC = (short) (intValue(ACC) + intValue(opd1));

    }
    
    public void br() {
            
    	PC = opd1;
            
    }

    public void brneg() {

    	if(ACC < 0)
    		PC = opd1;
    	
    }

    public void brpos() {

    	if(ACC > 0)
    		PC = opd1;

    }
    
    public void brzero(){
        if(ACC == 0)
            PC = opd1;
    }
    
    public void call (){
        SP.push(PC);
        PC = opd1;
    }
    
    public void copy(){
        opd1 = opd2;
    }
    
    public void div(){
        ACC = (short)(intValue(ACC)/intValue(opd1));
    }
    
    public void load(){
        
        ACC = shortValue(memoria.get(intValue(opd1)));
    }
     
    public void mult(){
        ACC = (short)(intValue(ACC) * intValue(opd1));
    }
    
    public void read(){
        opd1 = ui.input;
    }
    
    public void ret(){
        PC = (short)SP.pop();
    }
    
    public boolean stop(){
        return true;
    }
    
    public void store(){
        memoria.add(intValue(opd1),intValue(ACC));
    }
    
    public void sub(){
        ACC = (short)(intValue(ACC)-intValue(opd1));
    }
    
    public void write(){
       //ui.output = (short)opd1;
       ui.output(String.valueOf(opd1));
    }
    
}