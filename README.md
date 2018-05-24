# TestGarden

To add a template in eclipse:
Go to Window > Preferences > Java > Editor > Templates and create or edit one template
```
@${testType:newType(org.junit.Test)}
public void ${unit}_${scenario}_${expectation}(){
${a:importStatic('org.junit.Assert.*')}${m:importStatic('org.hamcrest.CoreMatchers.*')}${cursor}}
```
If you want to use Gherkin on eclipse, you can do those steps:
1. DL cucumber plugin 
2. add the following depedencies :
* cukes.cucumber
* cukes.cucumberpicocontainer
* cukes.cucumberjunit

 ## créer des smoke tests
  
  ### les smoke tests permettent d'entrer dans la boucle impossible refactor / test
  
   - a partir d'un jeu de données resultant de l'application , on peut faire une comparaison des resultats    
   - on s'assure que le refactor rendra le meme jeu de données
    
  ### Mais les smoke tests ne sont pas suffisants (plugin eclipse mutation test)
 
  - va regarder le code testé et effectuer des modifs (erreurs triviales)
  - va voir si les smoke tests couvrent des modifs du code
  - si ça reste vert => il y a un problème 
  - sinon on sait que le smoke test est probant

see Hexagonal Architecture and Clean Architecture
