/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.tools.authoring.desktop.dat.custnodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mil.arl.gift.tools.authoring.common.util.DomainKnowledgeUtil;
import mil.arl.gift.tools.authoring.desktop.common.XMLAuthoringToolClassFileSelectionDialog;

/**
 * This is the XML Editor custom node dialog for the trend metric implementation class element in the dkf schema file.
 * The dialog allows the user to specify which domain module trend metric class to use in a dkf being developed using the DAT.
 * 
 * @author mhoffman
 *
 */
public class TrendMetricDialog extends XMLAuthoringToolClassFileSelectionDialog {
    
    private static final long serialVersionUID = 1L;
    
    /** instance of the logger */
    private static Logger logger = LoggerFactory.getLogger(TrendMetricDialog.class);
    
    /** title of the dialog */
    private static final String TITLE = "Trend Metric Implementation";
    
    private static final String LABEL = "Please select an entry.\n" +
    		"To specify your own implementation of a Domain Module trend metric class,\n" +
    		" please provide the class path from the mil.arl.gift package, followed by the class name.\n" +
    		"(e.g. domain.common.metric.trend.MyCustomAlgorithm)\n" +
    		"Providing a custom class parameter allows a GIFT developer to create their own implementation class";

    private static List<SelectionItem> DEFAULT_ENTRIES = new ArrayList<>();
    static{
        
        try{
            List<String> values = DomainKnowledgeUtil.getTrendMetricImplementations();
            for(String value : values){
                SelectionItem item = new SelectionItem(value, null);
                DEFAULT_ENTRIES.add(item);
            }
        
        }catch(Exception e){
            System.out.println("Unable to populate the default list of trend metric because of the following exception.");
            e.printStackTrace();
            logger.error("Caught exception while trying to populate the default list of trend metrics.", e);
        }
        
        Collections.sort(DEFAULT_ENTRIES);
    }
    
    /**
     * Class constructor - create dialog
     */
    public TrendMetricDialog(){
        super(TITLE, LABEL, DEFAULT_ENTRIES);

    }

    @Override
    public String[] getCustomValues() {
        
        return new String[0];
    }

    @Override
    public void addUserEntry(String value) {
        
    }

}