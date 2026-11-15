# Week 1 — Game Structure Progress

## Implemented
- Preserved the starter Main, Game, Player, GameMode, and Utils classes.
- Main starts the Game controller.
- Game uses Scanner input and repeats its menu until Exit.
- Create Player stores a name in a Player object with starting level 1.
- Choose Game Theme supports Fantasy Dungeon, Cyber Hacker, and Space Explorer.
- View Player shows the name, level, and selected theme.
- Start Action is a placeholder for future gameplay and checks that a player and theme exist.
- Invalid menu and theme choices display helpful messages.

## How to run
Open the project in Eclipse and run `src/Main.java` as a Java application.

## Manual test checklist (complete in Eclipse)
- [ ] Run Main.java and verify the menu appears.
- [ ] Enter an invalid menu number and verify the menu repeats.
- [ ] Choose 1 and enter a player name.
- [ ] Choose 2 and select theme 2 (Cyber Hacker).
- [ ] Choose 3 and verify player name, level 1, and Cyber Hacker.
- [ ] Choose 4 and verify the future-action placeholder.
- [ ] Choose 5 and verify the program exits.
- [ ] Save a readable console screenshot as `screenshots/week1-menu.png`.

## Notes
This week focuses on structure, not complete gameplay. Testing and screenshots must be completed locally before Canvas submission.
