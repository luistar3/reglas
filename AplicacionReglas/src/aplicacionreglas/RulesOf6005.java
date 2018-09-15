/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionreglas;

/**
 *
 * @author ADMIN
 */
public class RulesOf6005 {

    /* Juzgue si un determinado fragmento de código
    puede ser utilizado en una tarea 
    (conjunto de problemas o proyecto de equipo) 
    o no, de acuerdo con la política de colaboración 6.005.
    
    @Param writtenByYourself verdadero si el código en cuestión fue
    escrito por ti mismo o, en el caso de un proyecto de equipo, por tu 
    compañero de equipo ,de lo contrario falso.
    
    @param availableToOthers if not writtenByYourself,si el código en cuestión
    está disponible o no para todos los demás estudiantes de la clase. 
    De lo contrario, se ignorará.
    
    @param writtenAsCourseWork if not writtenByYourself,
    si el código en cuestión fue escrito específicamente 
    como parte de una solución a una asignación 6.005, 
    en el semestre actual o en el pasado. De lo contrario, se ignorará.
    
    @param citingYourSource ´citando su fuente´ if not writtenByYourself, 
    si cita o no correctamente su fuente. De lo contrario, se ignorará.
    
    @param implementationRequired si la asignación le pide 
    específicamente que implemente la característica en cuestión.
    
    @return Ya sea que se trate o no, en base a la información proporcionada en los 
    argumentos, es probable que se le permita utilizar el código 
    en cuestión en su asignación, de acuerdo con la política de 
    colaboración de 6.005 para el semestre en curso.
    */
    
    
      /**
     * Judge whether a given piece of code may be used in an assignment (problem
     * set or team project) or not, according to the 6.005 collaboration policy.
     * 
     * @param writtenByYourself true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     * @param availableToOthers if not writtenByYourself, whether or not the
     *        code in question is available to all other students in the class.
     *        Otherwise ignored.
     * @param writtenAsCourseWork if not writtenByYourself, whether or not the
     *        code in question was written specifically as part of a solution to
     *        a 6.005 assignment, in the current or past semesters. Otherwise
     *        ignored.
     * @param citingYourSource if not writtenByYourself, whether or not you
     *        properly cite your source. Otherwise ignored.
     * @param implementationRequired whether the assignment specifically asks
     *        you to implement the feature in question.
     * @return Whether or not, based on the information provided in the
     *         arguments, you are likely to be allowed to use the code in
     *         question in your assignment, according to the 6.005 collaboration
     *         policy for the current semester.
     */
      public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
        // TODO: Fill in this method, then remove the exception
    	
    	//return (writtenByYourself && !availableToOthers && writtenAsCourseWork && citingYourSource && implementationRequired);
        
          
   	  if(writtenByYourself && !availableToOthers && writtenAsCourseWork && citingYourSource && implementationRequired)
   	  		return true;
   	  else
   	  		return false;
   	 

    	
    	
       //throw new UnsupportedOperationException();

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(""+ RulesOf6005.mayUseCodeInAssignment(true,true,true,true,true));
        
    }
    
}
