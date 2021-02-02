package be.intecbrussel.recipeproject.commands;

import be.intecbrussel.recipeproject.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private Recipe recipe;
    private String recipeNotes;
}