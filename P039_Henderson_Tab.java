import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;

/**
* P039_Henderson_Tab implements the 5x5 tabbed panel grid for group 2. Group 2 consists
* of panels 27-52, inclusive. This excludes panel 39 which is the the ID of the tab author.
*
* @author Christopher Henderson, chris@chenderson.org
* @version 1.0
*/
public class P039_Henderson_Tab extends JPanel {

	public P039_Henderson_Tab() {
		this.setLayout(new GridLayout(5, 5));
		this.add(new P027_Dua_Panel(1));
		this.add(new P028_Dusad_Panel(2).preparePanelUI(2));
		this.add(new P029_Dutta_Panel(3));
		// this.add(new P030_NAME_Panel(4));	Does not exist.
		this.add(new P031_Faldu_Panel(5));
		// this.add(new P032_NAME_Panel(6));	Does not exist.
		this.add(new P033_Goel_Panel(7));
		this.add(new P034_Gorantla_Panel(8));
		this.add(new P035_Gupta_Panel(9));
		this.add(new P036_Gupta_Panel(10));
		this.add(new P037_Gupta_Panel(11).getJPanelInstance());
		// this.add(new P039_NAME_Panel(12));	The owner of the tab, ignored but commented to keep the numbers contiguous.
		this.add(new P038_Gupta_Panel(12));
		// this.add(new P040_NAME_Panel(13));	Does not exist.
		this.add(new P041_Hosahalli_Panel(14).preparePanelUI(new Color(173,216,230))); // Oh come on, guys. It's called a constructor.
		// this.add(new P042_Yiru_Panel(15));	Is not a panel. Will not work. Does not appear to be done.
		this.add(new P043_Iyer_Panel(16));
		// this.add(new P044_NAME_Panel(17));	Does not exist.
		this.add(P045_JOHAR_Panel.getInstance(18));
		// this.add(new P046_NAME_Panel(19));	Does not exist.
		this.add(new P047_Kakarla_Panel(20).P047_Kakarla_Panel());
		this.add(new P048_Kalluri_Panel(21));
		this.add(new P049_Kandimalla_Panel(22));
		this.add(new P050_Kapadia_Panel(23));
		this.add(new P051_Kapoor_Panel(24));
		// this.add(new P052_Kasam_Panel(25));	Does not exist
		this.add(new P131_Zhou_Panel(25)); //	This person swears that they are group 2. Whatever.
	}
}