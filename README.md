# Pokedex Porject

The project that was coded is located at the PokedexProject folder. All the other folders were created and are a reference to the materials and classes given at the course by
Quentin Richaud.

# Run Pokedex Project

To run this project it is necessary to clone the git repository: git clone <project-url>

With that done, it is necessary to access the project directory trought the terminal, until you enter the PokedexProject folder.

Being in the PokedexProject folder, to run the project and acess the pokedex run: 

If you have a Java environment on your machine, you can directly run the commands.


# Build the project

```
./gradlew build
```

# Run the application

```
./gradlew run
```

To run the application with command line arguments, to access the Pokemon API run with just one argument, being this argument an integer number (Pokemon ID). If you get any access error or API unavailability, run the following command with 2 arguments, beignt the first one the Pokemon id and the second the file name local data base: pokemondatabase.sqlite  :

```
./gradlew run --args="premierArgument secondArgument"
```


# Run the tests

```
./gradlew test
```

# Instructions given by the professor:

Le contenu du cours magistral se trouve dans le fichier `./presentation/presentation.html`, slides animées en JS.

Pour y accéder via un petit serveur HTTP : 

- Lancer `./run.sh` à la racine du dépot
- Éditer le contenu des slides dans le fichier `slides.md`
- Accéder à la présentation via l'URL : `http://localhost:8000/presentation/presentation.html`

# 2 - Sujet du TP

Le sujet du TP se trouve dans le fichier `./sujet_TP/sujet.html`.

Vous trouverez les ressources nécessaire au TP dans le dossier `./sujet_TP/ressources/`.

# 3 - TP bootstrap

Le squelette du code pour démarrer le TP se trouve dans le dossier `./PokedexProject`. Vous trouverez en place des examples de code
pour vous aider à utiliser certaines librairies Java nécessaire au TP.

# 4 - Solution du TP

La solution a l'exercice est dans une archive ZIP `PokedexProject_Solution.zip` qui a été encryptée avec la commande `mcrypt`.

Décrypter la solution avec la commande suivante : 

```
mcrypt -d PokedexProject_Solution.zip.nc
```

Le mot de passe pour décrypter l'archive vous sera communiqué après le rendu pour que vous ayiez accès à la solution.

Si vous craquez le mot de passe, grand bien vous fasse, ça vous aura surement demandé plus d'efforts que la réalisation du TP ;)
