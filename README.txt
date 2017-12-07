README.TXT

---- Projet Qualité logiciel ----

--Le projet--
Nom: Columns (Tetris like)
type: Jeu
Langage: JAVA
Bibliotèques/Framework: AWT (interface graphique)
Description: Le but du jeu est de faire descendre des blocs sur un plateau de jeu comme dans un Tetris, cependant ici, on ne cherche pas optimiser l'espace grace aux formes des blocs mais grâce à leur couleurs. Lorsque 3 ou plus blocs d emême couleurs sont cote-à-cote, ils disparaissent; laissant ainsi de la place libre et faisant gagner des points.


--Les patterns--
Nous avons implémenté les trois patterns suivant à notre projet:
-Model View Controller
-Singleton
-State

--Choix des patterns--
Nous avons choisi d'implémenter le Model View Controller parce que c'est l'un des design patterns les plus répandus et nous voulions appliquer ce design pattern au langage Java. Pour l'instant nous ne l'avions utilisé uniquement PHP pour le développement d'un site de jeu en ligne. Le pattern MVC nous permet de mieux structurer notre code et il est de plus une composition d'autre patterns (Observer, Strategy). Ce qui nous a paermis de grandement nous familiariser avec les patterns.
Cependant nous avons trouvé que le mvc peut parfois rendre le code plus complexe, bien que plus structuré, surtout sur des projets de grande envergure.

Nous avons implémenté le pattern Singleton à notre projet car il ne peut y avoir qu'une seule instance du board de jeu.
Pour cela nous avons donc rendu privé le constructeur de ce dernier et modifié les appels des méthodes de cette classe pour qu'ils s'effectuent sur l'unique instance du plateau de jeu.

State ........

--L'équipe--
Nous sommes deux à avoir travailler sur ce projet.
Timothé s'est fortement investi dans les recherches sur les différents patterns pendant qu'Adrien identifiait sur quel projet nous pourrions au mieux les implémenter. Une fois les patterns identifiés et le projet choisi, nous avons travaillé ensemble pour identifier les élements à changer et effectuer les modifications.


"""" IDEES POUR LE BLABLA DE STATE """"""
I'm just learning to implement the state pattern which looks very promising for creating user interfaces that adapt to different application states. I use Model View Controller a lot and I'm wondering what the best way to get these two to work together is. The source material I have been learning the state pattern from doesn't really do anything visual, and my primary reason for using it is to make interface changes (disable buttons, etc) based on the state. So my question is, where does it fit in with the MVC pattern?
It really depends on what you want to do. Some people abuse the state pattern and try to create workflows from it. So, if you want to create a set of page flows the state pattern shouldn't be used.

The component-model has been gaining a lot of traction as a replacement to MVC, and can be thought of similarly to service-oriented designs used in the back-end. Instead each widget knows how to display itself, handle its data, and business logic and the page is simply wiring them together. Then you can use the state model in a widget to help organize the business logic. This would be a fairly clean approach to adopting it.

The big problem with the state model is that it doesn't scale very well. It works great for small sets and then combining components, which is how it is done in hardware. Software developers often create large the state models (such as workflows) which eventually causes the model to break down and the code to become unmanagable.

You can always seperate application states from component states, and allow the relevant application states to be input properties for the component. The components could then behave correctly and still own all MVC aspects. This is better than putting all states at the application level and thus spreading the MVC details across the entire UI layer.

In this case, the 'degraded mode' isn't really a state-pattern state. Its just an execution mode. Some frameworks, such as JSF, have different "renders" to allow components to know how to display themselves. This rarely works well, though, because most sites that care would want entirely different page behavior (e.g. mobile).

I'm a back-end developer, not a UI guru, but that would be my approach. Its much easier to separate concerns and deal with fewer variables at once. The UI frameworks generally make you deal with everything at once, which is why they break so often. 
"""""