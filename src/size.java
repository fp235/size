import javax.swing.JOptionPane;

public class size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String numPeople1 = JOptionPane.showInputDialog("Enter number of people in the group"); 
		int numPeople = Short.parseShort(numPeople1);
		int groupSize = numPeople/2 ;
		int groupSize1 = numPeople/3;
		
		if (numPeople > 10 )
		{
			
			JOptionPane.showMessageDialog(null, groupSize);
		
		
		} else if (numPeople >3 && numPeople < 10 ) {
			
			JOptionPane.showMessageDialog(null, groupSize1);
		

		}else{
			
			JOptionPane.showMessageDialog(null," The number of people has to be greater than 3");	
			
			
		}
}
	}