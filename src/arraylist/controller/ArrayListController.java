package arraylist.controller;

import java.util.ArrayList;
import lists.view.ListViewer;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	private ListViewer popupDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListViewer();
	}
	
	public void start()
	{
		firstWords.add("posudfhgasdfga");
		firstWords.add("bababababababababababab");
		displayList();
	}
	
	private void displayList()
	{
		for(int spot = 0; spot <firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " + " are " + firstWords.get(spot));
		}
	}
}
