package com.app.yasmina.medical.fragment;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import com.app.yasmina.medical.R;
import com.app.yasmina.medical.other.CardContent;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoduleHyperFragment extends NonExpandableCardFragment {

    public NoduleHyperFragment() {
        // Required empty public constructor
    }

    @Override
    public void prepareCards() {
        final int CARDS_COUNT = 3;
        final int FOOTER_TEXTS_COUNT = 5;
        final int FOOTER_IMAGES_COUNT = 2;

        final int CARD_ONE = 0;
        final int CARD_TWO = 1;
        final int CARD_THREE = 2;

        final int TITLE = 0;
        final int IMAGE_TITLE_ONE = 1;
        final int IMAGE_TITLE_TWO = 2;
        final int TEXT_ONE = 3;
        final int TEXT_TWO = 4;

        final int IMAGE_ONE = 0;
        final int IMAGE_TWO = 1;

        String[] cardHeaderText = new String[CARDS_COUNT];
        String[][] cardFooterTexts = new String[CARDS_COUNT][FOOTER_TEXTS_COUNT];
        Drawable[][] cardFooterImages  = new Drawable[CARDS_COUNT][FOOTER_IMAGES_COUNT];

        // First Card
        cardHeaderText[CARD_ONE] = (String) getResources().getText(R.string.hypo_one_header);
        cardFooterTexts[CARD_ONE][TITLE] = (String) getResources().getText(R.string.hypo_one_footer_title);
        cardFooterTexts[CARD_ONE][TEXT_ONE] = (String) getResources().getText(R.string.hypo_one_footer_text_one);
        cardFooterTexts[CARD_ONE][TEXT_TWO] = (String) getResources().getText(R.string.hypo_one_footer_text_two);
        cardFooterImages[CARD_ONE][IMAGE_TWO] = ContextCompat.getDrawable(getContext(), R.drawable.nodule_hypochogne);

        // Second Card
        cardHeaderText[CARD_TWO] = (String) getResources().getText(R.string.hypo_two_header);
        // TODO: header_bis
        cardFooterTexts[CARD_TWO][TITLE] = (String) getResources().getText(R.string.hypo_two_footer_title);
        cardFooterTexts[CARD_TWO][TEXT_ONE] = (String) getResources().getText(R.string.hypo_two_footer_text_one);
        cardFooterTexts[CARD_TWO][TEXT_TWO] = (String) getResources().getText(R.string.hypo_two_footer_text_two);
        cardFooterImages[CARD_TWO][IMAGE_TWO] = ContextCompat.getDrawable(getContext(), R.drawable.nodule_hypo);

        // Third Card
        cardHeaderText[CARD_THREE] = (String) getResources().getText(R.string.hypo_three_header);
        cardFooterTexts[CARD_THREE][TITLE] = (String) getResources().getText(R.string.hypo_three_footer_title);
        cardFooterTexts[CARD_THREE][IMAGE_TITLE_ONE] = (String) getResources().getText(R.string.hypo_three_footer_image_title_one);
        cardFooterTexts[CARD_THREE][IMAGE_TITLE_TWO] = (String) getResources().getText(R.string.hypo_three_footer_image_title_two);
        cardFooterTexts[CARD_THREE][TEXT_ONE] = (String) getResources().getText(R.string.hypo_three_footer_text_one);
        cardFooterTexts[CARD_THREE][TEXT_TWO] = (String) getResources().getText(R.string.hypo_three_footer_text_two);
        cardFooterImages[CARD_THREE][IMAGE_ONE] = ContextCompat.getDrawable(getContext(), R.drawable.thyroide);
        cardFooterImages[CARD_THREE][IMAGE_TWO] = ContextCompat.getDrawable(getContext(), R.drawable.gonglion);

        for (int i = 0; i < CARDS_COUNT; i++) {
            cardList.add(new CardContent(cardHeaderText[i], cardFooterTexts[i], cardFooterImages[i]));
        }

        adapter.notifyDataSetChanged();
    }
}
