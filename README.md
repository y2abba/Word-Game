![alt text](https://github.com/y2abba/Word-Game/blob/master/word-game.png?raw=true)

*Run the .jar file to experience the game without needing to use the Greenfoot IDE*

1.
Yameen Abba
Stanley Chan
Kelvin Mo
Steven Lin

2. What did you use in your project?
In our project we used arraylists, hashmaps, and queues. These data structures are mostly found in the following classes:
MyWorld
Scores
A majority of the other classes utilize the arraylists, hashmaps, and queues created in these classes. Arraylist was used to randomize all the words and set up the vocabularies and the words system. The hashmap was used to organize all the words currently in the world in the corresponding letters. This helped us prevent any words spawning with the same first characters, thus avoiding ambiguities. Queues were used in order to enqueue all the characters and words that the user had input into the game. The queue was later used at the endscreen after the player died and would dequeue all of the words that the user had killed and displayed them.  

3. What was the coolest thing you did?
I feel that the typing mechanic was pretty creative in terms of how it works, as it searches through a hashmap, checks if there is a word value that exists in the key containing the letter that they pressed, then acting accordingly. Additionally, I felt as if the word spawning mechanic was also creative, as it would only spawn the word in the world so long as another word with the same first letter as it didn't already exist in the world. One thing that took us a while to figure out was how to sort all of the high scores into ascending order. We were originally going to use hashmaps, but we found it most effective to use an arraylist that stores a bunch of playerscore objects, each having their own name and score. This method was considerably less confusing than using hashmaps. Speaking about scores, the entire score system was pretty much the final ordeal for our project as we couldn't quite figure out how to transfer the scores and save them throughout all the worlds and not have them reset whenever the player switched worlds. We eventually figured this out by making the scores object a general object and not extend actor. Then we made the scores arraylist static so we could use it across different classes. One of the bugs that we figured out how to solve had to do with the shooter and the laser. When the laser and the shooter was spawned, we had to code it to automatically turn towards the word. This became an issue when it wasn't actually turning towards the word but it automatically rotated in the opposite direction. After a while we finally figured out the solution to the problem which was to rotate it 90 degrees every time it spawned. Another bug that we found was when we would remove a word from the world. The problem was that whenever we removed a word it would remove another word that would spawn with the same letter. We fixed this by checking if the word being removed was the word that we intended to remove.
4. How would you improve your game?

We were originally going to have different music playing for each menu screen, but each music file was incredibly large, so changing back and forth from song to song as the player navigated through the menus took up noticeably lots of memory, and as such as ran into multiple java heap memory space errors. Also, we were also planning on having multiple different power ups, such as the ability to shoot faster lasers, having the enemies slow down, etc. but the first powerup took us so long to figure out that we just decided to stick with one due to time constraints. If time allows, we would also like to add in increasing difficulty stages which enemies with larger health bars as the "boss". However, that would require us to add in actors of the health bars. To have a variety of enemy spaceships would be one of the development that we should focus on in the future.

 
