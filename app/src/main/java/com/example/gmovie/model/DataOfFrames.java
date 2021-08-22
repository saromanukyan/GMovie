package com.example.gmovie.model;

import com.example.gmovie.R;

import java.util.ArrayList;

public class DataOfFrames {
    public final static ArrayList<Picture> PICTURE_ARRAY_LIST = pictureArrayList();

    private static ArrayList<Picture> pictureArrayList() {
        ArrayList<Picture> list = new ArrayList<>();
        list.add(new Picture(R.drawable.question_10_cloverfield_lane_01, "10 Cloverfield Lane"));
        list.add(new Picture(R.drawable.question_300_01, "300"));
        list.add(new Picture(R.drawable.question_a_viking_saga_01, "Northmen - A Viking Saga"));
        list.add(new Picture(R.drawable.question_after_earth_01, "After Earth"));
        list.add(new Picture(R.drawable.question_apocalypto_01, "Apocalypto"));
        list.add(new Picture(R.drawable.question_armageddon_01, "Armageddon"));
        list.add(new Picture(R.drawable.question_avatar_01, "Avatar"));
        list.add(new Picture(R.drawable.question_black_panther_01, "Black Panther"));
        list.add(new Picture(R.drawable.question_braveheart_01, "Braveheart"));
        list.add(new Picture(R.drawable.question_deadpool_01, "Deadpool"));
        list.add(new Picture(R.drawable.question_edge_of_tomorrow_01, "Edge of Tomorrow"));
        list.add(new Picture(R.drawable.question_game_of_thrones_01, "Game of Thrones"));
        list.add(new Picture(R.drawable.question_gladiator_01, "Gladiator"));
        list.add(new Picture(R.drawable.question_good_bad_ugly_01, "The Good, the Bad and the Ugly"));
        list.add(new Picture(R.drawable.question_gravity_01, "Gravity"));
        list.add(new Picture(R.drawable.question_groundhog_day_01, "Groundhog Day"));
        list.add(new Picture(R.drawable.question_guardians_of_the_galaxy_01, "Guardians of the Galaxy"));
        list.add(new Picture(R.drawable.question_house_md_01, "House, M.D."));
        list.add(new Picture(R.drawable.question_house_of_cards_01, "House of Cards"));
        list.add(new Picture(R.drawable.question_lalaland_01, "La La Land"));
        list.add(new Picture(R.drawable.question_mad_max_fury_road_01, "Mad Max: Fury Road"));
        list.add(new Picture(R.drawable.question_madagascar_01, "Madagascar"));
        list.add(new Picture(R.drawable.question_maleficent_01, "Maleficent"));
        list.add(new Picture(R.drawable.question_man_in_black_ll_01, "Men in Black II"));
        list.add(new Picture(R.drawable.question_million_dollar_baby_01, "Million Dollar Baby"));
        list.add(new Picture(R.drawable.question_poirot_01, "Poirot"));
        list.add(new Picture(R.drawable.question_rise_of_the_planet_of_apes_01, "Rise of the Planet of the Apes"));
        list.add(new Picture(R.drawable.question_the_boss_baby_01, "The Boss Baby"));
        list.add(new Picture(R.drawable.question_the_devils_advocate_01, "The Devil's Advocate"));
        list.add(new Picture(R.drawable.question_the_greate_wall_01, "The Great Wall"));
        list.add(new Picture(R.drawable.question_the_last_samurai_01, "The Last Samurai"));
        list.add(new Picture(R.drawable.question_the_mummy_01, "The Mummy"));
        list.add(new Picture(R.drawable.question_the_revenant_01, "The Revenant"));
        list.add(new Picture(R.drawable.question_the_x_files_01, "The X-Files"));
        list.add(new Picture(R.drawable.question_troy_01, "Troy"));
        list.add(new Picture(R.drawable.question_yes_man_01, "Yes Man"));
        list.add(new Picture(R.drawable.question_zootopia_01, "Zootopia"));

        return list;
    }
}
