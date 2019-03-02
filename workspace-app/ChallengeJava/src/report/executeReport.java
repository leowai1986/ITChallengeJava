package report;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;

public class executeReport {

	static void executeReportEstadoAlumno() throws EngineException {
		 
	    IReportEngine engine = null;
	    EngineConfig config = null;
	 
	    try {
	        config = new EngineConfig();          
	        config.setBIRTHome("C:\\birt\\birt-runtime-4.8.0-20180626\\ReportEngine");
	        config.setLogConfig("c:/temp/", Level.FINEST);
	        Platform.startup(config);
	        final IReportEngineFactory FACTORY = (IReportEngineFactory) Platform
	            .createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
	        engine = FACTORY.createReportEngine(config);       
	 
	        // Open the report design
	        IReportRunnable design = null;
	        design = engine.openReportDesign("src/report/estadoAlumno.rptdesign"); 
	        IRunAndRenderTask task = engine.createRunAndRenderTask(design);
	        
	        Map<String, Object> birtParams = new HashMap<String, Object>()
	        {
	        	private static final long serialVersionUID = 1L;
			{
				//Puede cambiar el id del alumno para mostrar en el reporte
	            put("idalumno", 4);
	        }};
			
	        task.setParameterValues( birtParams );
	 
	        final HTMLRenderOption HTML_OPTIONS = new HTMLRenderOption();       
	        HTML_OPTIONS.setOutputFileName("c:/temp/EstadoAlumno.html");
	        HTML_OPTIONS.setOutputFormat("html");
	 
	        task.setRenderOption(HTML_OPTIONS);
	        task.run();
	        task.close();
	        engine.destroy();
	    } catch(final Exception EX) {
	        EX.printStackTrace();
	    } finally {
	       Platform.shutdown();
	    }
	}
	
	static void executeReportEstadoCurso() throws EngineException {
		 
	    IReportEngine engine = null;
	    EngineConfig config = null;
	 
	    try {
	        config = new EngineConfig();          
	        config.setBIRTHome("C:\\birt\\birt-runtime-4.8.0-20180626\\ReportEngine");
	        config.setLogConfig("c:/temp/", Level.FINEST);
	        Platform.startup(config);
	        final IReportEngineFactory FACTORY = (IReportEngineFactory) Platform
	            .createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
	        engine = FACTORY.createReportEngine(config);       
	 
	        // Open the report design
	        IReportRunnable design = null;
	        design = engine.openReportDesign("src/report/comCurso.rptdesign"); 
	        IRunAndRenderTask task = engine.createRunAndRenderTask(design);
	        
	        Map<String, Object> birtParams = new HashMap<String, Object>()
	        {
	        	private static final long serialVersionUID = 1L;
			{
				//Puede cambiar el id del curso para mostrar en el reporte
	            put("idcurso", 1);
	        }};
			
	        task.setParameterValues( birtParams );
	 
	        final HTMLRenderOption HTML_OPTIONS = new HTMLRenderOption();       
	        HTML_OPTIONS.setOutputFileName("c:/temp/EstadoCurso.html");
	        HTML_OPTIONS.setOutputFormat("html");
	 
	        task.setRenderOption(HTML_OPTIONS);
	        task.run();
	        task.close();
	        engine.destroy();
	    } catch(final Exception EX) {
	        EX.printStackTrace();
	    } finally {
	       Platform.shutdown();
	    }
	}
	
	public static void main(final String[] ARGUMENTS) {
        try {
        	executeReportEstadoAlumno();
        	executeReportEstadoCurso();
        } catch (final Exception EX) {
           EX.printStackTrace();
        }
    }
}