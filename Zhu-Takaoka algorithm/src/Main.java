import java.util.*;

public class Main {

    public static void main(String[] args) {
        StringSearch ss = new StringSearch();
        StringBuilder uzunString = new StringBuilder();
        uzunString.append("ALICE'S ADVENTURES IN WONDERLAND\n" +
                "\n" +
                "Lewis Carroll\n" +
                "\n" +
                "CHAPTER I. Down the Rabbit-Hole\n" +
                "\n" +
                "Alice was beginning to get very tired of sitting by her sister on the\n" +
                "bank, and of having nothing to do: once or twice she had peeped into the\n" +
                "book her sister was reading, but it had no pictures or conversations in\n" +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or\n" +
                "conversation?'\n" +
                "\n" +
                "So she was considering in her own mind (as well as she could, for the\n" +
                "hot day made her feel very sleepy and stupid), whether the pleasure\n" +
                "of making a daisy-chain would be worth the trouble of getting up and\n" +
                "picking the daisies, when suddenly a White Rabbit with pink eyes ran\n" +
                "close by her.\n" +
                "\n" +
                "There was nothing so VERY remarkable in that; nor did Alice think it so\n" +
                "VERY much out of the way to hear the Rabbit say to itself, 'Oh dear!\n" +
                "Oh dear! I shall be late!' (when she thought it over afterwards, it\n" +
                "occurred to her that she ought to have wondered at this, but at the time\n" +
                "it all seemed quite natural); but when the Rabbit actually TOOK A WATCH\n" +
                "OUT OF ITS WAISTCOAT-POCKET, and looked at it, and then hurried on,\n" +
                "Alice started to her feet, for it flashed across her mind that she had\n" +
                "never before seen a rabbit with either a waistcoat-pocket, or a watch\n" +
                "to take out of it, and burning with curiosity, she ran across the field\n" +
                "after it, and fortunately was just in time to see it pop down a large\n" +
                "rabbit-hole under the hedge.");
        uzunString.append("In another moment down went Alice after it, never once considering how\n" +
                "in the world she was to get out again.\n" +
                "\n" +
                "The rabbit-hole went straight on like a tunnel for some way, and then\n" +
                "dipped suddenly down, so suddenly that Alice had not a moment to think\n" +
                "about stopping herself before she found herself falling down a very deep\n" +
                "well.\n" +
                "\n" +
                "Either the well was very deep, or she fell very slowly, for she had\n" +
                "plenty of time as she went down to look about her and to wonder what was\n" +
                "going to happen next. First, she tried to look down and make out what\n" +
                "she was coming to, but it was too dark to see anything; then she\n" +
                "looked at the sides of the well, and noticed that they were filled with\n" +
                "cupboards and book-shelves; here and there she saw maps and pictures\n" +
                "hung upon pegs. She took down a jar from one of the shelves as\n" +
                "she passed; it was labelled 'ORANGE MARMALADE', but to her great\n" +
                "disappointment it was empty: she did not like to drop the jar for fear\n" +
                "of killing somebody, so managed to put it into one of the cupboards as\n" +
                "she fell past it.\n" +
                "\n" +
                "'Well!' thought Alice to herself, 'after such a fall as this, I shall\n" +
                "think nothing of tumbling down stairs! How brave they'll all think me at\n" +
                "home! Why, I wouldn't say anything about it, even if I fell off the top\n" +
                "of the house!' (Which was very likely true.)\n" +
                "\n" +
                "Down, down, down. Would the fall NEVER come to an end! 'I wonder how\n" +
                "many miles I've fallen by this time?' she said aloud. 'I must be getting\n" +
                "somewhere near the centre of the earth. Let me see: that would be four\n" +
                "thousand miles down, I think--' (for, you see, Alice had learnt several\n" +
                "things of this sort in her lessons in the schoolroom, and though this\n" +
                "was not a VERY good opportunity for showing off her knowledge, as there\n" +
                "was no one to listen to her, still it was good practice to say it over)\n" +
                "'--yes, that's about the right distance--but then I wonder what Latitude\n" +
                "or Longitude I've got to?' (Alice had no idea what Latitude was, or\n" +
                "Longitude either, but thought they were nice grand words to say.)");
        uzunString.append("Presently she began again. 'I wonder if I shall fall right THROUGH the\n" +
                "earth! How funny it'll seem to come out among the people that walk with\n" +
                "their heads downward! The Antipathies, I think--' (she was rather glad\n" +
                "there WAS no one listening, this time, as it didn't sound at all the\n" +
                "right word) '--but I shall have to ask them what the name of the country\n" +
                "is, you know. Please, Ma'am, is this New Zealand or Australia?' (and\n" +
                "she tried to curtsey as she spoke--fancy CURTSEYING as you're falling\n" +
                "through the air! Do you think you could manage it?) 'And what an\n" +
                "ignorant little girl she'll think me for asking! No, it'll never do to\n" +
                "ask: perhaps I shall see it written up somewhere.'\n" +
                "\n" +
                "Down, down, down. There was nothing else to do, so Alice soon began\n" +
                "talking again. 'Dinah'll miss me very much to-night, I should think!'\n" +
                "(Dinah was the cat.) 'I hope they'll remember her saucer of milk at\n" +
                "tea-time. Dinah my dear! I wish you were down here with me! There are no\n" +
                "mice in the air, I'm afraid, but you might catch a bat, and that's very\n" +
                "like a mouse, you know. But do cats eat bats, I wonder?' And here Alice\n" +
                "began to get rather sleepy, and went on saying to herself, in a dreamy\n" +
                "sort of way, 'Do cats eat bats? Do cats eat bats?' and sometimes, 'Do\n" +
                "bats eat cats?' for, you see, as she couldn't answer either question,\n" +
                "it didn't much matter which way she put it. She felt that she was dozing\n" +
                "off, and had just begun to dream that she was walking hand in hand with\n" +
                "Dinah, and saying to her very earnestly, 'Now, Dinah, tell me the truth:\n" +
                "did you ever eat a bat?' when suddenly, thump! thump! down she came upon\n" +
                "a heap of sticks and dry leaves, and the fall was over.\n" +
                "\n" +
                "Alice was not a bit hurt, and she jumped up on to her feet in a moment:\n" +
                "she looked up, but it was all dark overhead; before her was another\n" +
                "long passage, and the White Rabbit was still in sight, hurrying down it.\n" +
                "There was not a moment to be lost: away went Alice like the wind, and\n" +
                "was just in time to hear it say, as it turned a corner, 'Oh my ears\n" +
                "and whiskers, how late it's getting!' She was close behind it when she\n" +
                "turned the corner, but the Rabbit was no longer to be seen: she found\n" +
                "herself in a long, low hall, which was lit up by a row of lamps hanging\n" +
                "from the roof.\n");
        uzunString.append("There were doors all round the hall, but they were all locked; and when\n" +
                "Alice had been all the way down one side and up the other, trying every\n" +
                "door, she walked sadly down the middle, wondering how she was ever to\n" +
                "get out again.\n" +
                "\n" +
                "Suddenly she came upon a little three-legged table, all made of solid\n" +
                "glass; there was nothing on it except a tiny golden key, and Alice's\n" +
                "first thought was that it might belong to one of the doors of the hall;\n" +
                "but, alas! either the locks were too large, or the key was too small,\n" +
                "but at any rate it would not open any of them. However, on the second\n" +
                "time round, she came upon a low curtain she had not noticed before, and\n" +
                "behind it was a little door about fifteen inches high: she tried the\n" +
                "little golden key in the lock, and to her great delight it fitted!\n" +
                "\n" +
                "Alice opened the door and found that it led into a small passage, not\n" +
                "much larger than a rat-hole: she knelt down and looked along the passage\n" +
                "into the loveliest garden you ever saw. How she longed to get out of\n" +
                "that dark hall, and wander about among those beds of bright flowers and\n" +
                "those cool fountains, but she could not even get her head through the\n" +
                "doorway; 'and even if my head would go through,' thought poor Alice, 'it\n" +
                "would be of very little use without my shoulders. Oh, how I wish I could\n" +
                "shut up like a telescope! I think I could, if I only know how to begin.'\n" +
                "For, you see, so many out-of-the-way things had happened lately,\n" +
                "that Alice had begun to think that very few things indeed were really\n" +
                "impossible.\n" +
                "\n" +
                "There seemed to be no use in waiting by the little door, so she went\n" +
                "back to the table, half hoping she might find another key on it, or at\n" +
                "any rate a book of rules for shutting people up like telescopes: this\n" +
                "time she found a little bottle on it, ('which certainly was not here\n" +
                "before,' said Alice,) and round the neck of the bottle was a paper\n" +
                "label, with the words 'DRINK ME' beautifully printed on it in large\n" +
                "letters.\n" +
                "\n" +
                "It was all very well to say 'Drink me,' but the wise little Alice was\n" +
                "not going to do THAT in a hurry. 'No, I'll look first,' she said, 'and\n" +
                "see whether it's marked \"poison\" or not'; for she had read several nice\n" +
                "little histories about children who had got burnt, and eaten up by wild\n" +
                "beasts and other unpleasant things, all because they WOULD not remember\n" +
                "the simple rules their friends had taught them: such as, that a red-hot\n" +
                "poker will burn you if you hold it too long; and that if you cut your\n" +
                "finger VERY deeply with a knife, it usually bleeds; and she had never\n" +
                "forgotten that, if you drink much from a bottle marked 'poison,' it is\n" +
                "almost certain to disagree with you, sooner or later.\n" +
                "\n" +
                "However, this bottle was NOT marked 'poison,' so Alice ventured to taste\n" +
                "it, and finding it very nice, (it had, in fact, a sort of mixed flavour\n" +
                "of cherry-tart, custard, pine-apple, roast turkey, toffee, and hot\n" +
                "buttered toast,) she very soon finished it off.");
        uzunString.append("'What a curious feeling!' said Alice; 'I must be shutting up like a\n" +
                "telescope.'\n" +
                "\n" +
                "And so it was indeed: she was now only ten inches high, and her face\n" +
                "brightened up at the thought that she was now the right size for going\n" +
                "through the little door into that lovely garden. First, however, she\n" +
                "waited for a few minutes to see if she was going to shrink any further:\n" +
                "she felt a little nervous about this; 'for it might end, you know,' said\n" +
                "Alice to herself, 'in my going out altogether, like a candle. I wonder\n" +
                "what I should be like then?' And she tried to fancy what the flame of a\n" +
                "candle is like after the candle is blown out, for she could not remember\n" +
                "ever having seen such a thing.\n" +
                "\n" +
                "After a while, finding that nothing more happened, she decided on going\n" +
                "into the garden at once; but, alas for poor Alice! when she got to the\n" +
                "door, she found she had forgotten the little golden key, and when she\n" +
                "went back to the table for it, she found she could not possibly reach\n" +
                "it: she could see it quite plainly through the glass, and she tried her\n" +
                "best to climb up one of the legs of the table, but it was too slippery;\n" +
                "and when she had tired herself out with trying, the poor little thing\n" +
                "sat down and cried.\n" +
                "\n" +
                "'Come, there's no use in crying like that!' said Alice to herself,\n" +
                "rather sharply; 'I advise you to leave off this minute!' She generally\n" +
                "gave herself very good advice, (though she very seldom followed it),\n" +
                "and sometimes she scolded herself so severely as to bring tears into\n" +
                "her eyes; and once she remembered trying to box her own ears for having\n" +
                "cheated herself in a game of croquet she was playing against herself,\n" +
                "for this curious child was very fond of pretending to be two people.\n" +
                "'But it's no use now,' thought poor Alice, 'to pretend to be two people!\n" +
                "Why, there's hardly enough of me left to make ONE respectable person!'\n" +
                "\n" +
                "Soon her eye fell on a little glass box that was lying under the table:\n" +
                "she opened it, and found in it a very small cake, on which the words\n" +
                "'EAT ME' were beautifully marked in currants. 'Well, I'll eat it,' said\n" +
                "Alice, 'and if it makes me grow larger, I can reach the key; and if it\n" +
                "makes me grow smaller, I can creep under the door; so either way I'll\n" +
                "get into the garden, and I don't care which happens!'\n" +
                "\n" +
                "She ate a little bit, and said anxiously to herself, 'Which way? Which\n" +
                "way?', holding her hand on the top of her head to feel which way it was\n" +
                "growing, and she was quite surprised to find that she remained the same\n" +
                "size: to be sure, this generally happens when one eats cake, but Alice\n" +
                "had got so much into the way of expecting nothing but out-of-the-way\n" +
                "things to happen, that it seemed quite dull and stupid for life to go on\n" +
                "in the common way.\n" +
                "\n" +
                "So she set to work, and very soon finished off the cake.\n");
        uzunString.append("CHAPTER II. The Pool of Tears\n" +
                "\n" +
                "'Curiouser and curiouser!' cried Alice (she was so much surprised, that\n" +
                "for the moment she quite forgot how to speak good English); 'now I'm\n" +
                "opening out like the largest telescope that ever was! Good-bye, feet!'\n" +
                "(for when she looked down at her feet, they seemed to be almost out of\n" +
                "sight, they were getting so far off). 'Oh, my poor little feet, I wonder\n" +
                "who will put on your shoes and stockings for you now, dears? I'm sure\n" +
                "_I_ shan't be able! I shall be a great deal too far off to trouble\n" +
                "myself about you: you must manage the best way you can;--but I must be\n" +
                "kind to them,' thought Alice, 'or perhaps they won't walk the way I want\n" +
                "to go! Let me see: I'll give them a new pair of boots every Christmas.'\n" +
                "\n" +
                "And she went on planning to herself how she would manage it. 'They must\n" +
                "go by the carrier,' she thought; 'and how funny it'll seem, sending\n" +
                "presents to one's own feet! And how odd the directions will look!\n" +
                "\n" +
                "     ALICE'S RIGHT FOOT, ESQ.\n" +
                "       HEARTHRUG,\n" +
                "         NEAR THE FENDER,\n" +
                "           (WITH ALICE'S LOVE).\n" +
                "\n" +
                "Oh dear, what nonsense I'm talking!'\n" +
                "\n" +
                "Just then her head struck against the roof of the hall: in fact she was\n" +
                "now more than nine feet high, and she at once took up the little golden\n" +
                "key and hurried off to the garden door.\n" +
                "\n" +
                "Poor Alice! It was as much as she could do, lying down on one side, to\n" +
                "look through into the garden with one eye; but to get through was more\n" +
                "hopeless than ever: she sat down and began to cry again.\n" +
                "\n" +
                "'You ought to be ashamed of yourself,' said Alice, 'a great girl like\n" +
                "you,' (she might well say this), 'to go on crying in this way! Stop this\n" +
                "moment, I tell you!' But she went on all the same, shedding gallons of\n" +
                "tears, until there was a large pool all round her, about four inches\n" +
                "deep and reaching half down the hall.\n" +
                "\n" +
                "After a time she heard a little pattering of feet in the distance, and\n" +
                "she hastily dried her eyes to see what was coming. It was the White\n" +
                "Rabbit returning, splendidly dressed, with a pair of white kid gloves in\n" +
                "one hand and a large fan in the other: he came trotting along in a great\n" +
                "hurry, muttering to himself as he came, 'Oh! the Duchess, the Duchess!\n" +
                "Oh! won't she be savage if I've kept her waiting!' Alice felt so\n" +
                "desperate that she was ready to ask help of any one; so, when the Rabbit\n" +
                "came near her, she began, in a low, timid voice, 'If you please, sir--'\n" +
                "The Rabbit started violently, dropped the white kid gloves and the fan,\n" +
                "and skurried away into the darkness as hard as he could go.\n" +
                "\n" +
                "Alice took up the fan and gloves, and, as the hall was very hot, she\n" +
                "kept fanning herself all the time she went on talking: 'Dear, dear! How\n" +
                "queer everything is to-day! And yesterday things went on just as usual.\n" +
                "I wonder if I've been changed in the night? Let me think: was I the\n" +
                "same when I got up this morning? I almost think I can remember feeling a\n" +
                "little different. But if I'm not the same, the next question is, Who\n" +
                "in the world am I? Ah, THAT'S the great puzzle!' And she began thinking\n" +
                "over all the children she knew that were of the same age as herself, to\n" +
                "see if she could have been changed for any of them.");
        uzunString.append("'I'm sure I'm not Ada,' she said, 'for her hair goes in such long\n" +
                "ringlets, and mine doesn't go in ringlets at all; and I'm sure I can't\n" +
                "be Mabel, for I know all sorts of things, and she, oh! she knows such a\n" +
                "very little! Besides, SHE'S she, and I'm I, and--oh dear, how puzzling\n" +
                "it all is! I'll try if I know all the things I used to know. Let me\n" +
                "see: four times five is twelve, and four times six is thirteen, and\n" +
                "four times seven is--oh dear! I shall never get to twenty at that rate!\n" +
                "However, the Multiplication Table doesn't signify: let's try Geography.\n" +
                "London is the capital of Paris, and Paris is the capital of Rome, and\n" +
                "Rome--no, THAT'S all wrong, I'm certain! I must have been changed for\n" +
                "Mabel! I'll try and say \"How doth the little--\"' and she crossed her\n" +
                "hands on her lap as if she were saying lessons, and began to repeat it,\n" +
                "but her voice sounded hoarse and strange, and the words did not come the\n" +
                "same as they used to do:--\n" +
                "\n" +
                "     'How doth the little crocodile\n" +
                "      Improve his shining tail,\n" +
                "     And pour the waters of the Nile\n" +
                "      On every golden scale!\n" +
                "\n" +
                "     'How cheerfully he seems to grin,\n" +
                "      How neatly spread his claws,\n" +
                "     And welcome little fishes in\n" +
                "      With gently smiling jaws!'\n" +
                "\n" +
                "'I'm sure those are not the right words,' said poor Alice, and her eyes\n" +
                "filled with tears again as she went on, 'I must be Mabel after all, and\n" +
                "I shall have to go and live in that poky little house, and have next to\n" +
                "no toys to play with, and oh! ever so many lessons to learn! No, I've\n" +
                "made up my mind about it; if I'm Mabel, I'll stay down here! It'll be no\n" +
                "use their putting their heads down and saying \"Come up again, dear!\" I\n" +
                "shall only look up and say \"Who am I then? Tell me that first, and then,\n" +
                "if I like being that person, I'll come up: if not, I'll stay down here\n" +
                "till I'm somebody else\"--but, oh dear!' cried Alice, with a sudden burst\n" +
                "of tears, 'I do wish they WOULD put their heads down! I am so VERY tired\n" +
                "of being all alone here!'\n" +
                "\n" +
                "As she said this she looked down at her hands, and was surprised to see\n" +
                "that she had put on one of the Rabbit's little white kid gloves while\n" +
                "she was talking. 'How CAN I have done that?' she thought. 'I must\n" +
                "be growing small again.' She got up and went to the table to measure\n" +
                "herself by it, and found that, as nearly as she could guess, she was now\n" +
                "about two feet high, and was going on shrinking rapidly: she soon found\n" +
                "out that the cause of this was the fan she was holding, and she dropped\n" +
                "it hastily, just in time to avoid shrinking away altogether.\n" +
                "\n" +
                "'That WAS a narrow escape!' said Alice, a good deal frightened at the\n" +
                "sudden change, but very glad to find herself still in existence; 'and\n" +
                "now for the garden!' and she ran with all speed back to the little door:\n" +
                "but, alas! the little door was shut again, and the little golden key was\n" +
                "lying on the glass table as before, 'and things are worse than ever,'\n" +
                "thought the poor child, 'for I never was so small as this before, never!\n" +
                "And I declare it's too bad, that it is!'");
        uzunString.append("As she said these words her foot slipped, and in another moment, splash!\n" +
                "she was up to her chin in salt water. Her first idea was that she\n" +
                "had somehow fallen into the sea, 'and in that case I can go back by\n" +
                "railway,' she said to herself. (Alice had been to the seaside once in\n" +
                "her life, and had come to the general conclusion, that wherever you go\n" +
                "to on the English coast you find a number of bathing machines in the\n" +
                "sea, some children digging in the sand with wooden spades, then a row\n" +
                "of lodging houses, and behind them a railway station.) However, she soon\n" +
                "made out that she was in the pool of tears which she had wept when she\n" +
                "was nine feet high.\n" +
                "\n" +
                "'I wish I hadn't cried so much!' said Alice, as she swam about, trying\n" +
                "to find her way out. 'I shall be punished for it now, I suppose, by\n" +
                "being drowned in my own tears! That WILL be a queer thing, to be sure!\n" +
                "However, everything is queer to-day.'\n" +
                "\n" +
                "Just then she heard something splashing about in the pool a little way\n" +
                "off, and she swam nearer to make out what it was: at first she thought\n" +
                "it must be a walrus or hippopotamus, but then she remembered how small\n" +
                "she was now, and she soon made out that it was only a mouse that had\n" +
                "slipped in like herself.\n" +
                "\n" +
                "'Would it be of any use, now,' thought Alice, 'to speak to this mouse?\n" +
                "Everything is so out-of-the-way down here, that I should think very\n" +
                "likely it can talk: at any rate, there's no harm in trying.' So she\n" +
                "began: 'O Mouse, do you know the way out of this pool? I am very tired\n" +
                "of swimming about here, O Mouse!' (Alice thought this must be the right\n" +
                "way of speaking to a mouse: she had never done such a thing before, but\n" +
                "she remembered having seen in her brother's Latin Grammar, 'A mouse--of\n" +
                "a mouse--to a mouse--a mouse--O mouse!') The Mouse looked at her rather\n" +
                "inquisitively, and seemed to her to wink with one of its little eyes,\n" +
                "but it said nothing.\n" +
                "\n" +
                "'Perhaps it doesn't understand English,' thought Alice; 'I daresay it's\n" +
                "a French mouse, come over with William the Conqueror.' (For, with all\n" +
                "her knowledge of history, Alice had no very clear notion how long ago\n" +
                "anything had happened.) So she began again: 'Ou est ma chatte?' which\n" +
                "was the first sentence in her French lesson-book. The Mouse gave a\n" +
                "sudden leap out of the water, and seemed to quiver all over with fright.\n" +
                "'Oh, I beg your pardon!' cried Alice hastily, afraid that she had hurt\n" +
                "the poor animal's feelings. 'I quite forgot you didn't like cats.'\n" +
                "\n" +
                "'Not like cats!' cried the Mouse, in a shrill, passionate voice. 'Would\n" +
                "YOU like cats if you were me?'\n" +
                "\n" +
                "'Well, perhaps not,' said Alice in a soothing tone: 'don't be angry\n" +
                "about it. And yet I wish I could show you our cat Dinah: I think you'd\n" +
                "take a fancy to cats if you could only see her. She is such a dear quiet\n" +
                "thing,' Alice went on, half to herself, as she swam lazily about in the\n" +
                "pool, 'and she sits purring so nicely by the fire, licking her paws and\n" +
                "washing her face--and she is such a nice soft thing to nurse--and she's\n" +
                "such a capital one for catching mice--oh, I beg your pardon!' cried\n" +
                "Alice again, for this time the Mouse was bristling all over, and she\n" +
                "felt certain it must be really offended. 'We won't talk about her any\n" +
                "more if you'd rather not.'\n ");
        uzunString.append("'We indeed!' cried the Mouse, who was trembling down to the end of his\n" +
                "tail. 'As if I would talk on such a subject! Our family always HATED\n" +
                "cats: nasty, low, vulgar things! Don't let me hear the name again!'\n" +
                "\n" +
                "'I won't indeed!' said Alice, in a great hurry to change the subject of\n" +
                "conversation. 'Are you--are you fond--of--of dogs?' The Mouse did not\n" +
                "answer, so Alice went on eagerly: 'There is such a nice little dog near\n" +
                "our house I should like to show you! A little bright-eyed terrier, you\n" +
                "know, with oh, such long curly brown hair! And it'll fetch things when\n" +
                "you throw them, and it'll sit up and beg for its dinner, and all sorts\n" +
                "of things--I can't remember half of them--and it belongs to a farmer,\n" +
                "you know, and he says it's so useful, it's worth a hundred pounds! He\n" +
                "says it kills all the rats and--oh dear!' cried Alice in a sorrowful\n" +
                "tone, 'I'm afraid I've offended it again!' For the Mouse was swimming\n" +
                "away from her as hard as it could go, and making quite a commotion in\n" +
                "the pool as it went.\n" +
                "\n" +
                "So she called softly after it, 'Mouse dear! Do come back again, and we\n" +
                "won't talk about cats or dogs either, if you don't like them!' When the\n" +
                "Mouse heard this, it turned round and swam slowly back to her: its\n" +
                "face was quite pale (with passion, Alice thought), and it said in a low\n" +
                "trembling voice, 'Let us get to the shore, and then I'll tell you my\n" +
                "history, and you'll understand why it is I hate cats and dogs.'\n" +
                "\n" +
                "It was high time to go, for the pool was getting quite crowded with the\n" +
                "birds and animals that had fallen into it: there were a Duck and a Dodo,\n" +
                "a Lory and an Eaglet, and several other curious creatures. Alice led the\n" +
                "way, and the whole party swam to the shore.\n" +
                "\n");
        uzunString.append("CHAPTER III. A Caucus-Race and a Long Tale\n" +
                "\n" +
                "They were indeed a queer-looking party that assembled on the bank--the\n" +
                "birds with draggled feathers, the animals with their fur clinging close\n" +
                "to them, and all dripping wet, cross, and uncomfortable.\n" +
                "\n" +
                "The first question of course was, how to get dry again: they had a\n" +
                "consultation about this, and after a few minutes it seemed quite natural\n" +
                "to Alice to find herself talking familiarly with them, as if she had\n" +
                "known them all her life. Indeed, she had quite a long argument with the\n" +
                "Lory, who at last turned sulky, and would only say, 'I am older than\n" +
                "you, and must know better'; and this Alice would not allow without\n" +
                "knowing how old it was, and, as the Lory positively refused to tell its\n" +
                "age, there was no more to be said.\n" +
                "\n" +
                "At last the Mouse, who seemed to be a person of authority among them,\n" +
                "called out, 'Sit down, all of you, and listen to me! I'LL soon make you\n" +
                "dry enough!' They all sat down at once, in a large ring, with the Mouse\n" +
                "in the middle. Alice kept her eyes anxiously fixed on it, for she felt\n" +
                "sure she would catch a bad cold if she did not get dry very soon.\n" +
                "\n" +
                "'Ahem!' said the Mouse with an important air, 'are you all ready? This\n" +
                "is the driest thing I know. Silence all round, if you please! \"William\n" +
                "the Conqueror, whose cause was favoured by the pope, was soon submitted\n" +
                "to by the English, who wanted leaders, and had been of late much\n" +
                "accustomed to usurpation and conquest. Edwin and Morcar, the earls of\n" +
                "Mercia and Northumbria--\"'\n" +
                "\n" +
                "'Ugh!' said the Lory, with a shiver.\n" +
                "\n" +
                "'I beg your pardon!' said the Mouse, frowning, but very politely: 'Did\n" +
                "you speak?'\n" +
                "\n" +
                "'Not I!' said the Lory hastily.\n" +
                "\n" +
                "'I thought you did,' said the Mouse. '--I proceed. \"Edwin and Morcar,\n" +
                "the earls of Mercia and Northumbria, declared for him: and even Stigand,\n" +
                "the patriotic archbishop of Canterbury, found it advisable--\"'\n" +
                "\n" +
                "'Found WHAT?' said the Duck.\n" +
                "\n" +
                "'Found IT,' the Mouse replied rather crossly: 'of course you know what\n" +
                "\"it\" means.'\n" +
                "\n" +
                "'I know what \"it\" means well enough, when I find a thing,' said the\n" +
                "Duck: 'it's generally a frog or a worm. The question is, what did the\n" +
                "archbishop find?'\n" +
                "\n" +
                "The Mouse did not notice this question, but hurriedly went on, '\"--found\n" +
                "it advisable to go with Edgar Atheling to meet William and offer him the\n" +
                "crown. William's conduct at first was moderate. But the insolence of his\n" +
                "Normans--\" How are you getting on now, my dear?' it continued, turning\n" +
                "to Alice as it spoke.\n" +
                "\n" +
                "'As wet as ever,' said Alice in a melancholy tone: 'it doesn't seem to\n" +
                "dry me at all.'\n" +
                "\n" +
                "'In that case,' said the Dodo solemnly, rising to its feet, 'I move\n" +
                "that the meeting adjourn, for the immediate adoption of more energetic\n" +
                "remedies--'\n" +
                "\n" +
                "'Speak English!' said the Eaglet. 'I don't know the meaning of half\n" +
                "those long words, and, what's more, I don't believe you do either!' And\n" +
                "the Eaglet bent down its head to hide a smile: some of the other birds\n" +
                "tittered audibly.\n" +
                "\n" +
                "'What I was going to say,' said the Dodo in an offended tone, 'was, that\n" +
                "the best thing to get us dry would be a Caucus-race.'\n" +
                "\n" +
                "'What IS a Caucus-race?' said Alice; not that she wanted much to know,\n" +
                "but the Dodo had paused as if it thought that SOMEBODY ought to speak,\n" +
                "and no one else seemed inclined to say anything.\n" +
                "\n" +
                "'Why,' said the Dodo, 'the best way to explain it is to do it.' (And, as\n" +
                "you might like to try the thing yourself, some winter day, I will tell\n" +
                "you how the Dodo managed it.)\n" +
                "\n" +
                "First it marked out a race-course, in a sort of circle, ('the exact\n" +
                "shape doesn't matter,' it said,) and then all the party were placed\n" +
                "along the course, here and there. There was no 'One, two, three, and\n" +
                "away,' but they began running when they liked, and left off when they\n" +
                "liked, so that it was not easy to know when the race was over. However,\n" +
                "when they had been running half an hour or so, and were quite dry again,\n" +
                "the Dodo suddenly called out 'The race is over!' and they all crowded\n" +
                "round it, panting, and asking, 'But who has won?'\n" +
                "\n" +
                "This question the Dodo could not answer without a great deal of thought,\n" +
                "and it sat for a long time with one finger pressed upon its forehead\n" +
                "(the position in which you usually see Shakespeare, in the pictures\n" +
                "of him), while the rest waited in silence. At last the Dodo said,\n" +
                "'EVERYBODY has won, and all must have prizes.'\n" +
                "\n" +
                "'But who is to give the prizes?' quite a chorus of voices asked.\n" +
                "\n" +
                "'Why, SHE, of course,' said the Dodo, pointing to Alice with one finger;\n" +
                "and the whole party at once crowded round her, calling out in a confused\n" +
                "way, 'Prizes! Prizes!'\n" +
                "\n" +
                "Alice had no idea what to do, and in despair she put her hand in her\n" +
                "pocket, and pulled out a box of comfits, (luckily the salt water had\n" +
                "not got into it), and handed them round as prizes. There was exactly one\n" +
                "a-piece all round.\n" +
                "\n" +
                "'But she must have a prize herself, you know,' said the Mouse.\n" +
                "\n" +
                "'Of course,' the Dodo replied very gravely. 'What else have you got in\n" +
                "your pocket?' he went on, turning to Alice.\n" +
                "\n" +
                "'Only a thimble,' said Alice sadly.\n" +
                "\n" +
                "'Hand it over here,' said the Dodo.\n" +
                "\n" +
                "Then they all crowded round her once more, while the Dodo solemnly\n" +
                "presented the thimble, saying 'We beg your acceptance of this elegant\n" +
                "thimble'; and, when it had finished this short speech, they all cheered.\n" +
                "\n" +
                "Alice thought the whole thing very absurd, but they all looked so grave\n" +
                "that she did not dare to laugh; and, as she could not think of anything\n" +
                "to say, she simply bowed, and took the thimble, looking as solemn as she\n" +
                "could. ");
        uzunString.append("The next thing was to eat the comfits: this caused some noise and\n" +
                "confusion, as the large birds complained that they could not taste\n" +
                "theirs, and the small ones choked and had to be patted on the back.\n" +
                "However, it was over at last, and they sat down again in a ring, and\n" +
                "begged the Mouse to tell them something more.\n" +
                "\n" +
                "'You promised to tell me your history, you know,' said Alice, 'and why\n" +
                "it is you hate--C and D,' she added in a whisper, half afraid that it\n" +
                "would be offended again.\n" +
                "\n" +
                "'Mine is a long and a sad tale!' said the Mouse, turning to Alice, and\n" +
                "sighing.\n" +
                "\n" +
                "'It IS a long tail, certainly,' said Alice, looking down with wonder at\n" +
                "the Mouse's tail; 'but why do you call it sad?' And she kept on puzzling\n" +
                "about it while the Mouse was speaking, so that her idea of the tale was\n" +
                "something like this:--\n" +
                "\n" +
                "         'Fury said to a\n" +
                "         mouse, That he\n" +
                "        met in the\n" +
                "       house,\n" +
                "     \"Let us\n" +
                "      both go to\n" +
                "       law: I will\n" +
                "        prosecute\n" +
                "         YOU.--Come,\n" +
                "           I'll take no\n" +
                "           denial; We\n" +
                "          must have a\n" +
                "        trial: For\n" +
                "      really this\n" +
                "     morning I've\n" +
                "    nothing\n" +
                "    to do.\"\n" +
                "     Said the\n" +
                "      mouse to the\n" +
                "       cur, \"Such\n" +
                "        a trial,\n" +
                "         dear Sir,\n" +
                "            With\n" +
                "          no jury\n" +
                "        or judge,\n" +
                "       would be\n" +
                "      wasting\n" +
                "      our\n" +
                "      breath.\"\n" +
                "       \"I'll be\n" +
                "        judge, I'll\n" +
                "         be jury,\"\n" +
                "            Said\n" +
                "         cunning\n" +
                "          old Fury:\n" +
                "          \"I'll\n" +
                "          try the\n" +
                "            whole\n" +
                "            cause,\n" +
                "              and\n" +
                "           condemn\n" +
                "           you\n" +
                "          to\n" +
                "           death.\"'\n" +
                "\n" +
                "\n" +
                "'You are not attending!' said the Mouse to Alice severely. 'What are you\n" +
                "thinking of?'\n" +
                "\n" +
                "'I beg your pardon,' said Alice very humbly: 'you had got to the fifth\n" +
                "bend, I think?'\n" +
                "\n" +
                "'I had NOT!' cried the Mouse, sharply and very angrily.\n" +
                "\n" +
                "'A knot!' said Alice, always ready to make herself useful, and looking\n" +
                "anxiously about her. 'Oh, do let me help to undo it!'\n" +
                "\n" +
                "'I shall do nothing of the sort,' said the Mouse, getting up and walking\n" +
                "away. 'You insult me by talking such nonsense!'\n" +
                "\n" +
                "'I didn't mean it!' pleaded poor Alice. 'But you're so easily offended,\n" +
                "you know!'\n" +
                "\n" +
                "The Mouse only growled in reply.\n" +
                "\n" +
                "'Please come back and finish your story!' Alice called after it; and the\n" +
                "others all joined in chorus, 'Yes, please do!' but the Mouse only shook\n" +
                "its head impatiently, and walked a little quicker.\n" +
                "\n" +
                "'What a pity it wouldn't stay!' sighed the Lory, as soon as it was quite\n" +
                "out of sight; and an old Crab took the opportunity of saying to her\n" +
                "daughter 'Ah, my dear! Let this be a lesson to you never to lose\n" +
                "YOUR temper!' 'Hold your tongue, Ma!' said the young Crab, a little\n" +
                "snappishly. 'You're enough to try the patience of an oyster!'\n" +
                "\n" +
                "'I wish I had our Dinah here, I know I do!' said Alice aloud, addressing\n" +
                "nobody in particular. 'She'd soon fetch it back!'\n" +
                "\n" +
                "'And who is Dinah, if I might venture to ask the question?' said the\n" +
                "Lory.\n" +
                "\n" +
                "Alice replied eagerly, for she was always ready to talk about her pet:\n" +
                "'Dinah's our cat. And she's such a capital one for catching mice you\n" +
                "can't think! And oh, I wish you could see her after the birds! Why,\n" +
                "she'll eat a little bird as soon as look at it!'\n" +
                "\n" +
                "This speech caused a remarkable sensation among the party. Some of the\n" +
                "birds hurried off at once: one old Magpie began wrapping itself up very\n" +
                "carefully, remarking, 'I really must be getting home; the night-air\n" +
                "doesn't suit my throat!' and a Canary called out in a trembling voice to\n" +
                "its children, 'Come away, my dears! It's high time you were all in bed!'\n" +
                "On various pretexts they all moved off, and Alice was soon left alone.\n" +
                "\n" +
                "'I wish I hadn't mentioned Dinah!' she said to herself in a melancholy\n" +
                "tone. 'Nobody seems to like her, down here, and I'm sure she's the best\n" +
                "cat in the world! Oh, my dear Dinah! I wonder if I shall ever see you\n" +
                "any more!' And here poor Alice began to cry again, for she felt very\n" +
                "lonely and low-spirited. In a little while, however, she again heard\n" +
                "a little pattering of footsteps in the distance, and she looked up\n" +
                "eagerly, half hoping that the Mouse had changed his mind, and was coming\n" +
                "back to finish his story.\n" +
                "\n");
        uzunString.append("CHAPTER IV. The Rabbit Sends in a Little Bill\n" +
                "\n" +
                "It was the White Rabbit, trotting slowly back again, and looking\n" +
                "anxiously about as it went, as if it had lost something; and she heard\n" +
                "it muttering to itself 'The Duchess! The Duchess! Oh my dear paws! Oh\n" +
                "my fur and whiskers! She'll get me executed, as sure as ferrets are\n" +
                "ferrets! Where CAN I have dropped them, I wonder?' Alice guessed in a\n" +
                "moment that it was looking for the fan and the pair of white kid gloves,\n" +
                "and she very good-naturedly began hunting about for them, but they were\n" +
                "nowhere to be seen--everything seemed to have changed since her swim in\n" +
                "the pool, and the great hall, with the glass table and the little door,\n" +
                "had vanished completely.\n" +
                "\n" +
                "Very soon the Rabbit noticed Alice, as she went hunting about, and\n" +
                "called out to her in an angry tone, 'Why, Mary Ann, what ARE you doing\n" +
                "out here? Run home this moment, and fetch me a pair of gloves and a fan!\n" +
                "Quick, now!' And Alice was so much frightened that she ran off at once\n" +
                "in the direction it pointed to, without trying to explain the mistake it\n" +
                "had made.\n" +
                "\n" +
                "'He took me for his housemaid,' she said to herself as she ran. 'How\n" +
                "surprised he'll be when he finds out who I am! But I'd better take him\n" +
                "his fan and gloves--that is, if I can find them.' As she said this, she\n" +
                "came upon a neat little house, on the door of which was a bright brass\n" +
                "plate with the name 'W. RABBIT' engraved upon it. She went in without\n" +
                "knocking, and hurried upstairs, in great fear lest she should meet the\n" +
                "real Mary Ann, and be turned out of the house before she had found the\n" +
                "fan and gloves.\n" +
                "\n" +
                "'How queer it seems,' Alice said to herself, 'to be going messages for\n" +
                "a rabbit! I suppose Dinah'll be sending me on messages next!' And she\n" +
                "began fancying the sort of thing that would happen: '\"Miss Alice! Come\n" +
                "here directly, and get ready for your walk!\" \"Coming in a minute,\n" +
                "nurse! But I've got to see that the mouse doesn't get out.\" Only I don't\n" +
                "think,' Alice went on, 'that they'd let Dinah stop in the house if it\n" +
                "began ordering people about like that!'\n" +
                "\n" +
                "By this time she had found her way into a tidy little room with a table\n" +
                "in the window, and on it (as she had hoped) a fan and two or three pairs\n" +
                "of tiny white kid gloves: she took up the fan and a pair of the gloves,\n" +
                "and was just going to leave the room, when her eye fell upon a little\n" +
                "bottle that stood near the looking-glass. There was no label this time\n" +
                "with the words 'DRINK ME,' but nevertheless she uncorked it and put it\n" +
                "to her lips. 'I know SOMETHING interesting is sure to happen,' she said\n" +
                "to herself, 'whenever I eat or drink anything; so I'll just see what\n" +
                "this bottle does. I do hope it'll make me grow large again, for really\n" +
                "I'm quite tired of being such a tiny little thing!'\n" +
                "\n" +
                "It did so indeed, and much sooner than she had expected: before she had\n" +
                "drunk half the bottle, she found her head pressing against the ceiling,\n" +
                "and had to stoop to save her neck from being broken. She hastily put\n" +
                "down the bottle, saying to herself 'That's quite enough--I hope I shan't\n" +
                "grow any more--As it is, I can't get out at the door--I do wish I hadn't\n" +
                "drunk quite so much!'\n" +
                "\n" +
                "Alas! it was too late to wish that! She went on growing, and growing,\n" +
                "and very soon had to kneel down on the floor: in another minute there\n" +
                "was not even room for this, and she tried the effect of lying down with\n" +
                "one elbow against the door, and the other arm curled round her head.\n" +
                "Still she went on growing, and, as a last resource, she put one arm out\n" +
                "of the window, and one foot up the chimney, and said to herself 'Now I\n" +
                "can do no more, whatever happens. What WILL become of me?'\n" +
                "\n" +
                "Luckily for Alice, the little magic bottle had now had its full effect,\n" +
                "and she grew no larger: still it was very uncomfortable, and, as there\n" +
                "seemed to be no sort of chance of her ever getting out of the room\n" +
                "again, no wonder she felt unhappy.\n" +
                "\n" +
                "'It was much pleasanter at home,' thought poor Alice, 'when one wasn't\n" +
                "always growing larger and smaller, and being ordered about by mice and\n" +
                "rabbits. I almost wish I hadn't gone down that rabbit-hole--and yet--and\n" +
                "yet--it's rather curious, you know, this sort of life! I do wonder what\n" +
                "CAN have happened to me! When I used to read fairy-tales, I fancied that\n" +
                "kind of thing never happened, and now here I am in the middle of one!\n" +
                "There ought to be a book written about me, that there ought! And when I\n" +
                "grow up, I'll write one--but I'm grown up now,' she added in a sorrowful\n" +
                "tone; 'at least there's no room to grow up any more HERE.'\n" +
                "\n" +
                "'But then,' thought Alice, 'shall I NEVER get any older than I am\n" +
                "now? That'll be a comfort, one way--never to be an old woman--but\n" +
                "then--always to have lessons to learn! Oh, I shouldn't like THAT!'\n" +
                "\n" +
                "'Oh, you foolish Alice!' she answered herself. 'How can you learn\n" +
                "lessons in here? Why, there's hardly room for YOU, and no room at all\n" +
                "for any lesson-books!'\n" +
                "\n" +
                "And so she went on, taking first one side and then the other, and making\n" +
                "quite a conversation of it altogether; but after a few minutes she heard\n" +
                "a voice outside, and stopped to listen.\n" +
                "\n" +
                "'Mary Ann! Mary Ann!' said the voice. 'Fetch me my gloves this moment!'\n" +
                "Then came a little pattering of feet on the stairs. Alice knew it was\n" +
                "the Rabbit coming to look for her, and she trembled till she shook the\n" +
                "house, quite forgetting that she was now about a thousand times as large\n" +
                "as the Rabbit, and had no reason to be afraid of it.\n" +
                "\n" +
                "Presently the Rabbit came up to the door, and tried to open it; but, as\n" +
                "the door opened inwards, and Alice's elbow was pressed hard against it,\n" +
                "that attempt proved a failure. Alice heard it say to itself 'Then I'll\n" +
                "go round and get in at the window.'\n" +
                "\n" +
                "'THAT you won't' thought Alice, and, after waiting till she fancied\n" +
                "she heard the Rabbit just under the window, she suddenly spread out her\n" +
                "hand, and made a snatch in the air. She did not get hold of anything,\n" +
                "but she heard a little shriek and a fall, and a crash of broken glass,\n" +
                "from which she concluded that it was just possible it had fallen into a\n" +
                "cucumber-frame, or something of the sort.\n" +
                "\n" +
                "Next came an angry voice--the Rabbit's--'Pat! Pat! Where are you?' And\n" +
                "then a voice she had never heard before, 'Sure then I'm here! Digging\n" +
                "for apples, yer honour!'\n" +
                "\n" +
                "'Digging for apples, indeed!' said the Rabbit angrily. 'Here! Come and\n" +
                "help me out of THIS!' (Sounds of more broken glass.)\n" +
                "\n" +
                "'Now tell me, Pat, what's that in the window?'\n" +
                "\n" +
                "'Sure, it's an arm, yer honour!' (He pronounced it 'arrum.')\n" +
                "\n" +
                "'An arm, you goose! Who ever saw one that size? Why, it fills the whole\n" +
                "window!'\n" +
                "\n" +
                "'Sure, it does, yer honour: but it's an arm for all that.'\n" +
                "\n" +
                "'Well, it's got no business there, at any rate: go and take it away!'\n" +
                "\n" +
                "There was a long silence after this, and Alice could only hear whispers\n" +
                "now and then; such as, 'Sure, I don't like it, yer honour, at all, at\n" +
                "all!' 'Do as I tell you, you coward!' and at last she spread out her\n" +
                "hand again, and made another snatch in the air. This time there were\n" +
                "TWO little shrieks, and more sounds of broken glass. 'What a number of\n" +
                "cucumber-frames there must be!' thought Alice. 'I wonder what they'll do\n" +
                "next! As for pulling me out of the window, I only wish they COULD! I'm\n" +
                "sure I don't want to stay in here any longer!'\n" +
                "\n" +
                "She waited for some time without hearing anything more: at last came a\n" +
                "rumbling of little cartwheels, and the sound of a good many voices\n" +
                "all talking together: she made out the words: 'Where's the other\n" +
                "ladder?--Why, I hadn't to bring but one; Bill's got the other--Bill!\n" +
                "fetch it here, lad!--Here, put 'em up at this corner--No, tie 'em\n" +
                "together first--they don't reach half high enough yet--Oh! they'll\n" +
                "do well enough; don't be particular--Here, Bill! catch hold of this\n" +
                "rope--Will the roof bear?--Mind that loose slate--Oh, it's coming\n" +
                "down! Heads below!' (a loud crash)--'Now, who did that?--It was Bill, I\n" +
                "fancy--Who's to go down the chimney?--Nay, I shan't! YOU do it!--That I\n" +
                "won't, then!--Bill's to go down--Here, Bill! the master says you're to\n" +
                "go down the chimney!'\n" +
                "\n" +
                "'Oh! So Bill's got to come down the chimney, has he?' said Alice to\n" +
                "herself. 'Shy, they seem to put everything upon Bill! I wouldn't be in\n" +
                "Bill's place for a good deal: this fireplace is narrow, to be sure; but\n" +
                "I THINK I can kick a little!'\n" +
                "\n" +
                "She drew her foot as far down the chimney as she could, and waited\n" +
                "till she heard a little animal (she couldn't guess of what sort it was)\n" +
                "scratching and scrambling about in the chimney close above her: then,\n" +
                "saying to herself 'This is Bill,' she gave one sharp kick, and waited to\n" +
                "see what would happen next.\n" +
                "\n" +
                "The first thing she heard was a general chorus of 'There goes Bill!'\n" +
                "then the Rabbit's voice along--'Catch him, you by the hedge!' then\n" +
                "silence, and then another confusion of voices--'Hold up his head--Brandy\n" +
                "now--Don't choke him--How was it, old fellow? What happened to you? Tell\n" +
                "us all about it!'\n" +
                "\n" +
                "Last came a little feeble, squeaking voice, ('That's Bill,' thought\n" +
                "Alice,) 'Well, I hardly know--No more, thank ye; I'm better now--but I'm\n" +
                "a deal too flustered to tell you--all I know is, something comes at me\n" +
                "like a Jack-in-the-box, and up I goes like a sky-rocket!'\n" +
                "\n" +
                "'So you did, old fellow!' said the others.\n" +
                "\n" +
                "'We must burn the house down!' said the Rabbit's voice; and Alice called\n" +
                "out as loud as she could, 'If you do. I'll set Dinah at you!'\n" +
                "\n" +
                "There was a dead silence instantly, and Alice thought to herself, 'I\n" +
                "wonder what they WILL do next! If they had any sense, they'd take the\n" +
                "roof off.' After a minute or two, they began moving about again, and\n" +
                "Alice heard the Rabbit say, 'A barrowful will do, to begin with.'\n" +
                "\n" +
                "'A barrowful of WHAT?' thought Alice; but she had not long to doubt,\n" +
                "for the next moment a shower of little pebbles came rattling in at the\n" +
                "window, and some of them hit her in the face. 'I'll put a stop to this,'\n" +
                "she said to herself, and shouted out, 'You'd better not do that again!'\n" +
                "which produced another dead silence.\n" +
                "\n" +
                "Alice noticed with some surprise that the pebbles were all turning into\n" +
                "little cakes as they lay on the floor, and a bright idea came into her\n" +
                "head. 'If I eat one of these cakes,' she thought, 'it's sure to make\n" +
                "SOME change in my size; and as it can't possibly make me larger, it must\n" +
                "make me smaller, I suppose.'\n ");
        uzunString.append("So she swallowed one of the cakes, and was delighted to find that she\n" +
                "began shrinking directly. As soon as she was small enough to get through\n" +
                "the door, she ran out of the house, and found quite a crowd of little\n" +
                "animals and birds waiting outside. The poor little Lizard, Bill, was\n" +
                "in the middle, being held up by two guinea-pigs, who were giving it\n" +
                "something out of a bottle. They all made a rush at Alice the moment she\n" +
                "appeared; but she ran off as hard as she could, and soon found herself\n" +
                "safe in a thick wood.\n" +
                "\n" +
                "'The first thing I've got to do,' said Alice to herself, as she wandered\n" +
                "about in the wood, 'is to grow to my right size again; and the second\n" +
                "thing is to find my way into that lovely garden. I think that will be\n" +
                "the best plan.'\n" +
                "\n" +
                "It sounded an excellent plan, no doubt, and very neatly and simply\n" +
                "arranged; the only difficulty was, that she had not the smallest idea\n" +
                "how to set about it; and while she was peering about anxiously among\n" +
                "the trees, a little sharp bark just over her head made her look up in a\n" +
                "great hurry.\n" +
                "\n" +
                "An enormous puppy was looking down at her with large round eyes, and\n" +
                "feebly stretching out one paw, trying to touch her. 'Poor little thing!'\n" +
                "said Alice, in a coaxing tone, and she tried hard to whistle to it; but\n" +
                "she was terribly frightened all the time at the thought that it might be\n" +
                "hungry, in which case it would be very likely to eat her up in spite of\n" +
                "all her coaxing.\n" +
                "\n" +
                "Hardly knowing what she did, she picked up a little bit of stick, and\n" +
                "held it out to the puppy; whereupon the puppy jumped into the air off\n" +
                "all its feet at once, with a yelp of delight, and rushed at the stick,\n" +
                "and made believe to worry it; then Alice dodged behind a great thistle,\n" +
                "to keep herself from being run over; and the moment she appeared on the\n" +
                "other side, the puppy made another rush at the stick, and tumbled head\n" +
                "over heels in its hurry to get hold of it; then Alice, thinking it was\n" +
                "very like having a game of play with a cart-horse, and expecting every\n" +
                "moment to be trampled under its feet, ran round the thistle again; then\n" +
                "the puppy began a series of short charges at the stick, running a very\n" +
                "little way forwards each time and a long way back, and barking hoarsely\n" +
                "all the while, till at last it sat down a good way off, panting, with\n" +
                "its tongue hanging out of its mouth, and its great eyes half shut.\n" +
                "\n" +
                "This seemed to Alice a good opportunity for making her escape; so she\n" +
                "set off at once, and ran till she was quite tired and out of breath, and\n" +
                "till the puppy's bark sounded quite faint in the distance.\n" +
                "\n" +
                "'And yet what a dear little puppy it was!' said Alice, as she leant\n" +
                "against a buttercup to rest herself, and fanned herself with one of the\n" +
                "leaves: 'I should have liked teaching it tricks very much, if--if I'd\n" +
                "only been the right size to do it! Oh dear! I'd nearly forgotten that\n" +
                "I've got to grow up again! Let me see--how IS it to be managed? I\n" +
                "suppose I ought to eat or drink something or other; but the great\n" +
                "question is, what?'\n" +
                "\n" +
                "The great question certainly was, what? Alice looked all round her at\n" +
                "the flowers and the blades of grass, but she did not see anything that\n" +
                "looked like the right thing to eat or drink under the circumstances.\n" +
                "There was a large mushroom growing near her, about the same height as\n" +
                "herself; and when she had looked under it, and on both sides of it, and\n" +
                "behind it, it occurred to her that she might as well look and see what\n" +
                "was on the top of it.\n" +
                "\n" +
                "She stretched herself up on tiptoe, and peeped over the edge of the\n" +
                "mushroom, and her eyes immediately met those of a large caterpillar,\n" +
                "that was sitting on the top with its arms folded, quietly smoking a long\n" +
                "hookah, and taking not the smallest notice of her or of anything else.\n" +
                "\n" +
                "\n ");
        uzunString.append("CHAPTER V. Advice from a Caterpillar\n" +
                "\n" +
                "The Caterpillar and Alice looked at each other for some time in silence:\n" +
                "at last the Caterpillar took the hookah out of its mouth, and addressed\n" +
                "her in a languid, sleepy voice.\n" +
                "\n" +
                "'Who are YOU?' said the Caterpillar.\n" +
                "\n" +
                "This was not an encouraging opening for a conversation. Alice replied,\n" +
                "rather shyly, 'I--I hardly know, sir, just at present--at least I know\n" +
                "who I WAS when I got up this morning, but I think I must have been\n" +
                "changed several times since then.'\n" +
                "\n" +
                "'What do you mean by that?' said the Caterpillar sternly. 'Explain\n" +
                "yourself!'\n" +
                "\n" +
                "'I can't explain MYSELF, I'm afraid, sir' said Alice, 'because I'm not\n" +
                "myself, you see.'\n" +
                "\n" +
                "'I don't see,' said the Caterpillar.\n" +
                "\n" +
                "'I'm afraid I can't put it more clearly,' Alice replied very politely,\n" +
                "'for I can't understand it myself to begin with; and being so many\n" +
                "different sizes in a day is very confusing.'\n" +
                "\n" +
                "'It isn't,' said the Caterpillar.\n" +
                "\n" +
                "'Well, perhaps you haven't found it so yet,' said Alice; 'but when you\n" +
                "have to turn into a chrysalis--you will some day, you know--and then\n" +
                "after that into a butterfly, I should think you'll feel it a little\n" +
                "queer, won't you?'\n" +
                "\n" +
                "'Not a bit,' said the Caterpillar.\n" +
                "\n" +
                "'Well, perhaps your feelings may be different,' said Alice; 'all I know\n" +
                "is, it would feel very queer to ME.'\n" +
                "\n" +
                "'You!' said the Caterpillar contemptuously. 'Who are YOU?'\n" +
                "\n" +
                "Which brought them back again to the beginning of the conversation.\n" +
                "Alice felt a little irritated at the Caterpillar's making such VERY\n" +
                "short remarks, and she drew herself up and said, very gravely, 'I think,\n" +
                "you ought to tell me who YOU are, first.'\n" +
                "\n" +
                "'Why?' said the Caterpillar.\n" +
                "\n" +
                "Here was another puzzling question; and as Alice could not think of any\n" +
                "good reason, and as the Caterpillar seemed to be in a VERY unpleasant\n" +
                "state of mind, she turned away.\n" +
                "\n" +
                "'Come back!' the Caterpillar called after her. 'I've something important\n" +
                "to say!'\n" +
                "\n" +
                "This sounded promising, certainly: Alice turned and came back again.\n" +
                "\n" +
                "'Keep your temper,' said the Caterpillar.\n" +
                "\n" +
                "'Is that all?' said Alice, swallowing down her anger as well as she\n" +
                "could.\n" +
                "\n" +
                "'No,' said the Caterpillar.\n" +
                "\n" +
                "Alice thought she might as well wait, as she had nothing else to do, and\n" +
                "perhaps after all it might tell her something worth hearing. For some\n" +
                "minutes it puffed away without speaking, but at last it unfolded its\n" +
                "arms, took the hookah out of its mouth again, and said, 'So you think\n" +
                "you're changed, do you?'\n" +
                "\n" +
                "'I'm afraid I am, sir,' said Alice; 'I can't remember things as I\n" +
                "used--and I don't keep the same size for ten minutes together!'\n" +
                "\n" +
                "'Can't remember WHAT things?' said the Caterpillar.\n" +
                "\n" +
                "'Well, I've tried to say \"HOW DOTH THE LITTLE BUSY BEE,\" but it all came\n" +
                "different!' Alice replied in a very melancholy voice.\n" +
                "\n" +
                "'Repeat, \"YOU ARE OLD, FATHER WILLIAM,\"' said the Caterpillar.\n" +
                "\n" +
                "Alice folded her hands, and began:--\n" +
                "\n" +
                "   'You are old, Father William,' the young man said,\n" +
                "    'And your hair has become very white;\n" +
                "   And yet you incessantly stand on your head--\n" +
                "    Do you think, at your age, it is right?'\n" +
                "\n" +
                "   'In my youth,' Father William replied to his son,\n" +
                "    'I feared it might injure the brain;\n" +
                "   But, now that I'm perfectly sure I have none,\n" +
                "    Why, I do it again and again.'\n" +
                "\n" +
                "   'You are old,' said the youth, 'as I mentioned before,\n" +
                "    And have grown most uncommonly fat;\n" +
                "   Yet you turned a back-somersault in at the door--\n" +
                "    Pray, what is the reason of that?'\n" +
                "\n" +
                "   'In my youth,' said the sage, as he shook his grey locks,\n" +
                "    'I kept all my limbs very supple\n" +
                "   By the use of this ointment--one shilling the box--\n" +
                "    Allow me to sell you a couple?'\n" +
                "\n" +
                "   'You are old,' said the youth, 'and your jaws are too weak\n" +
                "    For anything tougher than suet;\n" +
                "   Yet you finished the goose, with the bones and the beak--\n" +
                "    Pray how did you manage to do it?'\n" +
                "\n" +
                "   'In my youth,' said his father, 'I took to the law,\n" +
                "    And argued each case with my wife;\n" +
                "   And the muscular strength, which it gave to my jaw,\n" +
                "    Has lasted the rest of my life.'\n" +
                "\n" +
                "   'You are old,' said the youth, 'one would hardly suppose\n" +
                "    That your eye was as steady as ever;\n" +
                "   Yet you balanced an eel on the end of your nose--\n" +
                "    What made you so awfully clever?'\n" +
                "\n" +
                "   'I have answered three questions, and that is enough,'\n" +
                "    Said his father; 'don't give yourself airs!\n" +
                "   Do you think I can listen all day to such stuff?\n" +
                "    Be off, or I'll kick you down stairs!'\n" +
                "\n" +
                "\n" +
                "'That is not said right,' said the Caterpillar.\n" +
                "\n" +
                "'Not QUITE right, I'm afraid,' said Alice, timidly; 'some of the words\n" +
                "have got altered.'\n" +
                "\n" +
                "'It is wrong from beginning to end,' said the Caterpillar decidedly, and\n" +
                "there was silence for some minutes.\n" +
                "\n" +
                "The Caterpillar was the first to speak.\n" +
                "\n" +
                "'What size do you want to be?' it asked.\n" +
                "\n" +
                "'Oh, I'm not particular as to size,' Alice hastily replied; 'only one\n" +
                "doesn't like changing so often, you know.'\n" +
                "\n" +
                "'I DON'T know,' said the Caterpillar.\n" +
                "\n" +
                "Alice said nothing: she had never been so much contradicted in her life\n" +
                "before, and she felt that she was losing her temper.\n" +
                "\n" +
                "'Are you content now?' said the Caterpillar.\n" +
                "\n" +
                "'Well, I should like to be a LITTLE larger, sir, if you wouldn't mind,'\n" +
                "said Alice: 'three inches is such a wretched height to be.'\n" +
                "\n" +
                "'It is a very good height indeed!' said the Caterpillar angrily, rearing\n" +
                "itself upright as it spoke (it was exactly three inches high).\n" +
                "\n" +
                "'But I'm not used to it!' pleaded poor Alice in a piteous tone. And\n" +
                "she thought of herself, 'I wish the creatures wouldn't be so easily\n" +
                "offended!'\n" +
                "\n" +
                "'You'll get used to it in time,' said the Caterpillar; and it put the\n" +
                "hookah into its mouth and began smoking again.\n" +
                "\n" +
                "This time Alice waited patiently until it chose to speak again. In\n" +
                "a minute or two the Caterpillar took the hookah out of its mouth\n" +
                "and yawned once or twice, and shook itself. Then it got down off the\n" +
                "mushroom, and crawled away in the grass, merely remarking as it went,\n" +
                "'One side will make you grow taller, and the other side will make you\n" +
                "grow shorter.'\n" +
                "\n" +
                "'One side of WHAT? The other side of WHAT?' thought Alice to herself.\n" +
                "\n" +
                "'Of the mushroom,' said the Caterpillar, just as if she had asked it\n" +
                "aloud; and in another moment it was out of sight.\n" +
                "\n" +
                "Alice remained looking thoughtfully at the mushroom for a minute, trying\n" +
                "to make out which were the two sides of it; and as it was perfectly\n" +
                "round, she found this a very difficult question. However, at last she\n" +
                "stretched her arms round it as far as they would go, and broke off a bit\n" +
                "of the edge with each hand.\n" +
                "\n" +
                "'And now which is which?' she said to herself, and nibbled a little of\n" +
                "the right-hand bit to try the effect: the next moment she felt a violent\n" +
                "blow underneath her chin: it had struck her foot!\n" +
                "\n" +
                "She was a good deal frightened by this very sudden change, but she felt\n" +
                "that there was no time to be lost, as she was shrinking rapidly; so she\n" +
                "set to work at once to eat some of the other bit. Her chin was pressed\n" +
                "so closely against her foot, that there was hardly room to open her\n" +
                "mouth; but she did it at last, and managed to swallow a morsel of the\n" +
                "lefthand bit.\n");
        uzunString.append("'Come, my head's free at last!' said Alice in a tone of delight, which\n" +
                "changed into alarm in another moment, when she found that her shoulders\n" +
                "were nowhere to be found: all she could see, when she looked down, was\n" +
                "an immense length of neck, which seemed to rise like a stalk out of a\n" +
                "sea of green leaves that lay far below her.\n" +
                "\n" +
                "'What CAN all that green stuff be?' said Alice. 'And where HAVE my\n" +
                "shoulders got to? And oh, my poor hands, how is it I can't see you?'\n" +
                "She was moving them about as she spoke, but no result seemed to follow,\n" +
                "except a little shaking among the distant green leaves.\n" +
                "\n" +
                "As there seemed to be no chance of getting her hands up to her head, she\n" +
                "tried to get her head down to them, and was delighted to find that her\n" +
                "neck would bend about easily in any direction, like a serpent. She had\n" +
                "just succeeded in curving it down into a graceful zigzag, and was going\n" +
                "to dive in among the leaves, which she found to be nothing but the tops\n" +
                "of the trees under which she had been wandering, when a sharp hiss made\n" +
                "her draw back in a hurry: a large pigeon had flown into her face, and\n" +
                "was beating her violently with its wings.\n" +
                "\n" +
                "'Serpent!' screamed the Pigeon.\n" +
                "\n" +
                "'I'm NOT a serpent!' said Alice indignantly. 'Let me alone!'\n" +
                "\n" +
                "'Serpent, I say again!' repeated the Pigeon, but in a more subdued tone,\n" +
                "and added with a kind of sob, 'I've tried every way, and nothing seems\n" +
                "to suit them!'\n" +
                "\n" +
                "'I haven't the least idea what you're talking about,' said Alice.\n" +
                "\n" +
                "'I've tried the roots of trees, and I've tried banks, and I've tried\n" +
                "hedges,' the Pigeon went on, without attending to her; 'but those\n" +
                "serpents! There's no pleasing them!'\n" +
                "\n" +
                "Alice was more and more puzzled, but she thought there was no use in\n" +
                "saying anything more till the Pigeon had finished.\n" +
                "\n" +
                "'As if it wasn't trouble enough hatching the eggs,' said the Pigeon;\n" +
                "'but I must be on the look-out for serpents night and day! Why, I\n" +
                "haven't had a wink of sleep these three weeks!'\n" +
                "\n" +
                "'I'm very sorry you've been annoyed,' said Alice, who was beginning to\n" +
                "see its meaning.\n" +
                "\n" +
                "'And just as I'd taken the highest tree in the wood,' continued the\n" +
                "Pigeon, raising its voice to a shriek, 'and just as I was thinking I\n" +
                "should be free of them at last, they must needs come wriggling down from\n" +
                "the sky! Ugh, Serpent!'\n" +
                "\n" +
                "'But I'm NOT a serpent, I tell you!' said Alice. 'I'm a--I'm a--'\n" +
                "\n" +
                "'Well! WHAT are you?' said the Pigeon. 'I can see you're trying to\n" +
                "invent something!'\n" +
                "\n" +
                "'I--I'm a little girl,' said Alice, rather doubtfully, as she remembered\n" +
                "the number of changes she had gone through that day.\n" +
                "\n" +
                "'A likely story indeed!' said the Pigeon in a tone of the deepest\n" +
                "contempt. 'I've seen a good many little girls in my time, but never ONE\n" +
                "with such a neck as that! No, no! You're a serpent; and there's no use\n" +
                "denying it. I suppose you'll be telling me next that you never tasted an\n" +
                "egg!'\n" +
                "\n" +
                "'I HAVE tasted eggs, certainly,' said Alice, who was a very truthful\n" +
                "child; 'but little girls eat eggs quite as much as serpents do, you\n" +
                "know.'\n" +
                "\n" +
                "'I don't believe it,' said the Pigeon; 'but if they do, why then they're\n" +
                "a kind of serpent, that's all I can say.'\n" +
                "\n" +
                "This was such a new idea to Alice, that she was quite silent for a\n" +
                "minute or two, which gave the Pigeon the opportunity of adding, 'You're\n" +
                "looking for eggs, I know THAT well enough; and what does it matter to me\n" +
                "whether you're a little girl or a serpent?'\n" +
                "\n" +
                "'It matters a good deal to ME,' said Alice hastily; 'but I'm not looking\n" +
                "for eggs, as it happens; and if I was, I shouldn't want YOURS: I don't\n" +
                "like them raw.'\n" +
                "\n" +
                "'Well, be off, then!' said the Pigeon in a sulky tone, as it settled\n" +
                "down again into its nest. Alice crouched down among the trees as well as\n" +
                "she could, for her neck kept getting entangled among the branches, and\n" +
                "every now and then she had to stop and untwist it. After a while she\n" +
                "remembered that she still held the pieces of mushroom in her hands, and\n" +
                "she set to work very carefully, nibbling first at one and then at the\n" +
                "other, and growing sometimes taller and sometimes shorter, until she had\n" +
                "succeeded in bringing herself down to her usual height.\n" +
                "\n" +
                "It was so long since she had been anything near the right size, that it\n" +
                "felt quite strange at first; but she got used to it in a few minutes,\n" +
                "and began talking to herself, as usual. 'Come, there's half my plan done\n" +
                "now! How puzzling all these changes are! I'm never sure what I'm going\n" +
                "to be, from one minute to another! However, I've got back to my right\n" +
                "size: the next thing is, to get into that beautiful garden--how IS that\n" +
                "to be done, I wonder?' As she said this, she came suddenly upon an open\n" +
                "place, with a little house in it about four feet high. 'Whoever lives\n" +
                "there,' thought Alice, 'it'll never do to come upon them THIS size: why,\n" +
                "I should frighten them out of their wits!' So she began nibbling at the\n" +
                "righthand bit again, and did not venture to go near the house till she\n" +
                "had brought herself down to nine inches high.\n");
        uzunString.append("CHAPTER VI. Pig and Pepper\n" +
                "\n" +
                "For a minute or two she stood looking at the house, and wondering what\n" +
                "to do next, when suddenly a footman in livery came running out of the\n" +
                "wood--(she considered him to be a footman because he was in livery:\n" +
                "otherwise, judging by his face only, she would have called him a\n" +
                "fish)--and rapped loudly at the door with his knuckles. It was opened\n" +
                "by another footman in livery, with a round face, and large eyes like a\n" +
                "frog; and both footmen, Alice noticed, had powdered hair that curled all\n" +
                "over their heads. She felt very curious to know what it was all about,\n" +
                "and crept a little way out of the wood to listen.\n" +
                "\n" +
                "The Fish-Footman began by producing from under his arm a great letter,\n" +
                "nearly as large as himself, and this he handed over to the other,\n" +
                "saying, in a solemn tone, 'For the Duchess. An invitation from the Queen\n" +
                "to play croquet.' The Frog-Footman repeated, in the same solemn tone,\n" +
                "only changing the order of the words a little, 'From the Queen. An\n" +
                "invitation for the Duchess to play croquet.'\n" +
                "\n" +
                "Then they both bowed low, and their curls got entangled together.\n" +
                "\n" +
                "Alice laughed so much at this, that she had to run back into the\n" +
                "wood for fear of their hearing her; and when she next peeped out the\n" +
                "Fish-Footman was gone, and the other was sitting on the ground near the\n" +
                "door, staring stupidly up into the sky.\n" +
                "\n" +
                "Alice went timidly up to the door, and knocked.\n" +
                "\n" +
                "'There's no sort of use in knocking,' said the Footman, 'and that for\n" +
                "two reasons. First, because I'm on the same side of the door as you\n" +
                "are; secondly, because they're making such a noise inside, no one could\n" +
                "possibly hear you.' And certainly there was a most extraordinary noise\n" +
                "going on within--a constant howling and sneezing, and every now and then\n" +
                "a great crash, as if a dish or kettle had been broken to pieces.\n" +
                "\n" +
                "'Please, then,' said Alice, 'how am I to get in?'\n" +
                "\n" +
                "'There might be some sense in your knocking,' the Footman went on\n" +
                "without attending to her, 'if we had the door between us. For instance,\n" +
                "if you were INSIDE, you might knock, and I could let you out, you know.'\n" +
                "He was looking up into the sky all the time he was speaking, and this\n" +
                "Alice thought decidedly uncivil. 'But perhaps he can't help it,' she\n" +
                "said to herself; 'his eyes are so VERY nearly at the top of his head.\n" +
                "But at any rate he might answer questions.--How am I to get in?' she\n" +
                "repeated, aloud.\n" +
                "\n" +
                "'I shall sit here,' the Footman remarked, 'till tomorrow--'\n" +
                "\n" +
                "At this moment the door of the house opened, and a large plate came\n" +
                "skimming out, straight at the Footman's head: it just grazed his nose,\n" +
                "and broke to pieces against one of the trees behind him.\n" +
                "\n" +
                "'--or next day, maybe,' the Footman continued in the same tone, exactly\n" +
                "as if nothing had happened.\n" +
                "\n" +
                "'How am I to get in?' asked Alice again, in a louder tone.\n" +
                "\n" +
                "'ARE you to get in at all?' said the Footman. 'That's the first\n" +
                "question, you know.'\n" +
                "\n" +
                "It was, no doubt: only Alice did not like to be told so. 'It's really\n" +
                "dreadful,' she muttered to herself, 'the way all the creatures argue.\n" +
                "It's enough to drive one crazy!'\n" +
                "\n" +
                "The Footman seemed to think this a good opportunity for repeating his\n" +
                "remark, with variations. 'I shall sit here,' he said, 'on and off, for\n" +
                "days and days.'\n" +
                "\n" +
                "'But what am I to do?' said Alice.\n" +
                "\n" +
                "'Anything you like,' said the Footman, and began whistling.\n" +
                "\n" +
                "'Oh, there's no use in talking to him,' said Alice desperately: 'he's\n" +
                "perfectly idiotic!' And she opened the door and went in.\n" +
                "\n" +
                "The door led right into a large kitchen, which was full of smoke from\n" +
                "one end to the other: the Duchess was sitting on a three-legged stool in\n" +
                "the middle, nursing a baby; the cook was leaning over the fire, stirring\n" +
                "a large cauldron which seemed to be full of soup.\n" +
                "\n" +
                "'There's certainly too much pepper in that soup!' Alice said to herself,\n" +
                "as well as she could for sneezing.\n" +
                "\n" +
                "There was certainly too much of it in the air. Even the Duchess\n" +
                "sneezed occasionally; and as for the baby, it was sneezing and howling\n" +
                "alternately without a moment's pause. The only things in the kitchen\n" +
                "that did not sneeze, were the cook, and a large cat which was sitting on\n" +
                "the hearth and grinning from ear to ear.\n" +
                "\n" +
                "'Please would you tell me,' said Alice, a little timidly, for she was\n" +
                "not quite sure whether it was good manners for her to speak first, 'why\n" +
                "your cat grins like that?'\n" +
                "\n" +
                "'It's a Cheshire cat,' said the Duchess, 'and that's why. Pig!'\n" +
                "\n" +
                "She said the last word with such sudden violence that Alice quite\n" +
                "jumped; but she saw in another moment that it was addressed to the baby,\n" +
                "and not to her, so she took courage, and went on again:--\n" +
                "\n" +
                "'I didn't know that Cheshire cats always grinned; in fact, I didn't know\n" +
                "that cats COULD grin.'\n" +
                "\n" +
                "'They all can,' said the Duchess; 'and most of 'em do.'\n" +
                "\n" +
                "'I don't know of any that do,' Alice said very politely, feeling quite\n" +
                "pleased to have got into a conversation.\n" +
                "\n" +
                "'You don't know much,' said the Duchess; 'and that's a fact.'\n" +
                "\n" +
                "Alice did not at all like the tone of this remark, and thought it would\n" +
                "be as well to introduce some other subject of conversation. While she\n" +
                "was trying to fix on one, the cook took the cauldron of soup off the\n" +
                "fire, and at once set to work throwing everything within her reach at\n" +
                "the Duchess and the baby--the fire-irons came first; then followed a\n" +
                "shower of saucepans, plates, and dishes. The Duchess took no notice of\n" +
                "them even when they hit her; and the baby was howling so much already,\n" +
                "that it was quite impossible to say whether the blows hurt it or not.\n" +
                "\n" +
                "'Oh, PLEASE mind what you're doing!' cried Alice, jumping up and down in\n" +
                "an agony of terror. 'Oh, there goes his PRECIOUS nose'; as an unusually\n" +
                "large saucepan flew close by it, and very nearly carried it off.\n" +
                "\n" +
                "'If everybody minded their own business,' the Duchess said in a hoarse\n" +
                "growl, 'the world would go round a deal faster than it does.'\n" +
                "\n" +
                "'Which would NOT be an advantage,' said Alice, who felt very glad to get\n" +
                "an opportunity of showing off a little of her knowledge. 'Just think of\n" +
                "what work it would make with the day and night! You see the earth takes\n" +
                "twenty-four hours to turn round on its axis--'\n" +
                "\n" +
                "'Talking of axes,' said the Duchess, 'chop off her head!'\n" +
                "\n" +
                "Alice glanced rather anxiously at the cook, to see if she meant to take\n" +
                "the hint; but the cook was busily stirring the soup, and seemed not to\n" +
                "be listening, so she went on again: 'Twenty-four hours, I THINK; or is\n" +
                "it twelve? I--'\n" +
                "\n" +
                "'Oh, don't bother ME,' said the Duchess; 'I never could abide figures!'\n" +
                "And with that she began nursing her child again, singing a sort of\n" +
                "lullaby to it as she did so, and giving it a violent shake at the end of\n" +
                "every line:\n" +
                "\n" +
                "   'Speak roughly to your little boy,\n" +
                "    And beat him when he sneezes:\n" +
                "   He only does it to annoy,\n" +
                "    Because he knows it teases.'\n" +
                "\n" +
                "         CHORUS.\n" +
                "\n" +
                " (In which the cook and the baby joined):--\n" +
                "\n" +
                "       'Wow! wow! wow!'\n" +
                "\n" +
                "While the Duchess sang the second verse of the song, she kept tossing\n" +
                "the baby violently up and down, and the poor little thing howled so,\n" +
                "that Alice could hardly hear the words:--\n" +
                "\n" +
                "   'I speak severely to my boy,\n" +
                "    I beat him when he sneezes;\n" +
                "   For he can thoroughly enjoy\n" +
                "    The pepper when he pleases!'\n" +
                "\n" +
                "         CHORUS.\n" +
                "\n" +
                "       'Wow! wow! wow!'\n" +
                "\n" +
                "'Here! you may nurse it a bit, if you like!' the Duchess said to Alice,\n" +
                "flinging the baby at her as she spoke. 'I must go and get ready to play\n" +
                "croquet with the Queen,' and she hurried out of the room. The cook threw\n" +
                "a frying-pan after her as she went out, but it just missed her.\n" +
                "\n" +
                "Alice caught the baby with some difficulty, as it was a queer-shaped\n" +
                "little creature, and held out its arms and legs in all directions, 'just\n" +
                "like a star-fish,' thought Alice. The poor little thing was snorting\n" +
                "like a steam-engine when she caught it, and kept doubling itself up and\n" +
                "straightening itself out again, so that altogether, for the first minute\n" +
                "or two, it was as much as she could do to hold it.\n" +
                "\n" +
                "As soon as she had made out the proper way of nursing it, (which was to\n" +
                "twist it up into a sort of knot, and then keep tight hold of its right\n" +
                "ear and left foot, so as to prevent its undoing itself,) she carried\n" +
                "it out into the open air. 'IF I don't take this child away with me,'\n" +
                "thought Alice, 'they're sure to kill it in a day or two: wouldn't it be\n" +
                "murder to leave it behind?' She said the last words out loud, and the\n" +
                "little thing grunted in reply (it had left off sneezing by this time).\n" +
                "'Don't grunt,' said Alice; 'that's not at all a proper way of expressing\n" +
                "yourself.'\n" +
                "\n" +
                "The baby grunted again, and Alice looked very anxiously into its face to\n" +
                "see what was the matter with it. There could be no doubt that it had\n" +
                "a VERY turn-up nose, much more like a snout than a real nose; also its\n" +
                "eyes were getting extremely small for a baby: altogether Alice did not\n" +
                "like the look of the thing at all. 'But perhaps it was only sobbing,'\n" +
                "she thought, and looked into its eyes again, to see if there were any\n" +
                "tears.\n" +
                "\n" +
                "No, there were no tears. 'If you're going to turn into a pig, my dear,'\n" +
                "said Alice, seriously, 'I'll have nothing more to do with you. Mind\n" +
                "now!' The poor little thing sobbed again (or grunted, it was impossible\n" +
                "to say which), and they went on for some while in silence.\n" +
                "\n" +
                "Alice was just beginning to think to herself, 'Now, what am I to do with\n" +
                "this creature when I get it home?' when it grunted again, so violently,\n" +
                "that she looked down into its face in some alarm. This time there could\n" +
                "be NO mistake about it: it was neither more nor less than a pig, and she\n" +
                "felt that it would be quite absurd for her to carry it further.\n" +
                "\n" +
                "So she set the little creature down, and felt quite relieved to see\n" +
                "it trot away quietly into the wood. 'If it had grown up,' she said\n" +
                "to herself, 'it would have made a dreadfully ugly child: but it makes\n" +
                "rather a handsome pig, I think.' And she began thinking over other\n" +
                "children she knew, who might do very well as pigs, and was just saying\n" +
                "to herself, 'if one only knew the right way to change them--' when she\n" +
                "was a little startled by seeing the Cheshire Cat sitting on a bough of a\n" +
                "tree a few yards off.\n" +
                "\n" +
                "The Cat only grinned when it saw Alice. It looked good-natured, she\n" +
                "thought: still it had VERY long claws and a great many teeth, so she\n" +
                "felt that it ought to be treated with respect.\n" +
                "\n" +
                "'Cheshire Puss,' she began, rather timidly, as she did not at all know\n" +
                "whether it would like the name: however, it only grinned a little wider.\n" +
                "'Come, it's pleased so far,' thought Alice, and she went on. 'Would you\n" +
                "tell me, please, which way I ought to go from here?'\n" +
                "\n" +
                "'That depends a good deal on where you want to get to,' said the Cat.\n" +
                "\n" +
                "'I don't much care where--' said Alice.\n" +
                "\n" +
                "'Then it doesn't matter which way you go,' said the Cat.\n" +
                "\n" +
                "'--so long as I get SOMEWHERE,' Alice added as an explanation.\n" +
                "\n" +
                "'Oh, you're sure to do that,' said the Cat, 'if you only walk long\n" +
                "enough.'\n" +
                "\n" +
                "Alice felt that this could not be denied, so she tried another question.\n" +
                "'What sort of people live about here?'\n" +
                "\n" +
                "'In THAT direction,' the Cat said, waving its right paw round, 'lives\n" +
                "a Hatter: and in THAT direction,' waving the other paw, 'lives a March\n" +
                "Hare. Visit either you like: they're both mad.'\n" +
                "\n" +
                "'But I don't want to go among mad people,' Alice remarked.\n" +
                "\n" +
                "'Oh, you can't help that,' said the Cat: 'we're all mad here. I'm mad.\n" +
                "You're mad.'\n" +
                "\n" +
                "'How do you know I'm mad?' said Alice.\n" +
                "\n" +
                "'You must be,' said the Cat, 'or you wouldn't have come here.'\n" +
                "\n" +
                "Alice didn't think that proved it at all; however, she went on 'And how\n" +
                "do you know that you're mad?'\n" +
                "\n" +
                "'To begin with,' said the Cat, 'a dog's not mad. You grant that?'\n" +
                "\n" +
                "'I suppose so,' said Alice.\n" +
                "\n" +
                "'Well, then,' the Cat went on, 'you see, a dog growls when it's angry,\n" +
                "and wags its tail when it's pleased. Now I growl when I'm pleased, and\n" +
                "wag my tail when I'm angry. Therefore I'm mad.'\n" +
                "\n" +
                "'I call it purring, not growling,' said Alice.\n" +
                "\n" +
                "'Call it what you like,' said the Cat. 'Do you play croquet with the\n" +
                "Queen to-day?'\n" +
                "\n" +
                "'I should like it very much,' said Alice, 'but I haven't been invited\n" +
                "yet.'\n" +
                "\n" +
                "'You'll see me there,' said the Cat, and vanished.\n" +
                "\n" +
                "Alice was not much surprised at this, she was getting so used to queer\n" +
                "things happening. While she was looking at the place where it had been,\n" +
                "it suddenly appeared again.\n" +
                "\n" +
                "'By-the-bye, what became of the baby?' said the Cat. 'I'd nearly\n" +
                "forgotten to ask.'\n" +
                "\n" +
                "'It turned into a pig,' Alice quietly said, just as if it had come back\n" +
                "in a natural way.\n" +
                "\n" +
                "'I thought it would,' said the Cat, and vanished again.\n" +
                "\n" +
                "Alice waited a little, half expecting to see it again, but it did not\n" +
                "appear, and after a minute or two she walked on in the direction in\n" +
                "which the March Hare was said to live. 'I've seen hatters before,' she\n" +
                "said to herself; 'the March Hare will be much the most interesting, and\n" +
                "perhaps as this is May it won't be raving mad--at least not so mad as\n" +
                "it was in March.' As she said this, she looked up, and there was the Cat\n" +
                "again, sitting on a branch of a tree.\n" +
                "\n" +
                "'Did you say pig, or fig?' said the Cat.\n" +
                "\n" +
                "'I said pig,' replied Alice; 'and I wish you wouldn't keep appearing and\n" +
                "vanishing so suddenly: you make one quite giddy.'\n" +
                "\n" +
                "'All right,' said the Cat; and this time it vanished quite slowly,\n" +
                "beginning with the end of the tail, and ending with the grin, which\n" +
                "remained some time after the rest of it had gone.\n" +
                "\n" +
                "'Well! I've often seen a cat without a grin,' thought Alice; 'but a grin\n" +
                "without a cat! It's the most curious thing I ever saw in my life!'\n" +
                "\n" +
                "She had not gone much farther before she came in sight of the house\n" +
                "of the March Hare: she thought it must be the right house, because the\n" +
                "chimneys were shaped like ears and the roof was thatched with fur. It\n" +
                "was so large a house, that she did not like to go nearer till she had\n" +
                "nibbled some more of the lefthand bit of mushroom, and raised herself to\n" +
                "about two feet high: even then she walked up towards it rather timidly,\n" +
                "saying to herself 'Suppose it should be raving mad after all! I almost\n" +
                "wish I'd gone to see the Hatter instead!'\n" +
                "\n" +
                "\n");
        uzunString.append("CHAPTER VII. A Mad Tea-Party\n" +
                "\n" +
                "There was a table set out under a tree in front of the house, and the\n" +
                "March Hare and the Hatter were having tea at it: a Dormouse was sitting\n" +
                "between them, fast asleep, and the other two were using it as a\n" +
                "cushion, resting their elbows on it, and talking over its head. 'Very\n" +
                "uncomfortable for the Dormouse,' thought Alice; 'only, as it's asleep, I\n" +
                "suppose it doesn't mind.'\n" +
                "\n" +
                "The table was a large one, but the three were all crowded together at\n" +
                "one corner of it: 'No room! No room!' they cried out when they saw Alice\n" +
                "coming. 'There's PLENTY of room!' said Alice indignantly, and she sat\n" +
                "down in a large arm-chair at one end of the table.\n" +
                "\n" +
                "'Have some wine,' the March Hare said in an encouraging tone.\n" +
                "\n" +
                "Alice looked all round the table, but there was nothing on it but tea.\n" +
                "'I don't see any wine,' she remarked.\n" +
                "\n" +
                "'There isn't any,' said the March Hare.\n" +
                "\n" +
                "'Then it wasn't very civil of you to offer it,' said Alice angrily.\n" +
                "\n" +
                "'It wasn't very civil of you to sit down without being invited,' said\n" +
                "the March Hare.\n" +
                "\n" +
                "'I didn't know it was YOUR table,' said Alice; 'it's laid for a great\n" +
                "many more than three.'\n" +
                "\n" +
                "'Your hair wants cutting,' said the Hatter. He had been looking at Alice\n" +
                "for some time with great curiosity, and this was his first speech.\n" +
                "\n" +
                "'You should learn not to make personal remarks,' Alice said with some\n" +
                "severity; 'it's very rude.'\n" +
                "\n" +
                "The Hatter opened his eyes very wide on hearing this; but all he SAID\n" +
                "was, 'Why is a raven like a writing-desk?'\n" +
                "\n" +
                "'Come, we shall have some fun now!' thought Alice. 'I'm glad they've\n" +
                "begun asking riddles.--I believe I can guess that,' she added aloud.\n" +
                "\n" +
                "'Do you mean that you think you can find out the answer to it?' said the\n" +
                "March Hare.\n" +
                "\n" +
                "'Exactly so,' said Alice.\n" +
                "\n" +
                "'Then you should say what you mean,' the March Hare went on.\n" +
                "\n" +
                "'I do,' Alice hastily replied; 'at least--at least I mean what I\n" +
                "say--that's the same thing, you know.'\n" +
                "\n" +
                "'Not the same thing a bit!' said the Hatter. 'You might just as well say\n" +
                "that \"I see what I eat\" is the same thing as \"I eat what I see\"!'\n" +
                "\n" +
                "'You might just as well say,' added the March Hare, 'that \"I like what I\n" +
                "get\" is the same thing as \"I get what I like\"!'\n" +
                "\n" +
                "'You might just as well say,' added the Dormouse, who seemed to be\n" +
                "talking in his sleep, 'that \"I breathe when I sleep\" is the same thing\n" +
                "as \"I sleep when I breathe\"!'\n" +
                "\n" +
                "'It IS the same thing with you,' said the Hatter, and here the\n" +
                "conversation dropped, and the party sat silent for a minute, while Alice\n" +
                "thought over all she could remember about ravens and writing-desks,\n" +
                "which wasn't much.\n" +
                "\n" +
                "The Hatter was the first to break the silence. 'What day of the month\n" +
                "is it?' he said, turning to Alice: he had taken his watch out of his\n" +
                "pocket, and was looking at it uneasily, shaking it every now and then,\n" +
                "and holding it to his ear.\n" +
                "\n" +
                "Alice considered a little, and then said 'The fourth.'\n" +
                "\n" +
                "'Two days wrong!' sighed the Hatter. 'I told you butter wouldn't suit\n" +
                "the works!' he added looking angrily at the March Hare.\n" +
                "\n" +
                "'It was the BEST butter,' the March Hare meekly replied.\n" +
                "\n" +
                "'Yes, but some crumbs must have got in as well,' the Hatter grumbled:\n" +
                "'you shouldn't have put it in with the bread-knife.'\n" +
                "\n" +
                "The March Hare took the watch and looked at it gloomily: then he dipped\n" +
                "it into his cup of tea, and looked at it again: but he could think of\n" +
                "nothing better to say than his first remark, 'It was the BEST butter,\n" +
                "you know.'\n" +
                "\n" +
                "Alice had been looking over his shoulder with some curiosity. 'What a\n" +
                "funny watch!' she remarked. 'It tells the day of the month, and doesn't\n" +
                "tell what o'clock it is!'\n" +
                "\n" +
                "'Why should it?' muttered the Hatter. 'Does YOUR watch tell you what\n" +
                "year it is?'\n" +
                "\n" +
                "'Of course not,' Alice replied very readily: 'but that's because it\n" +
                "stays the same year for such a long time together.'\n" +
                "\n" +
                "'Which is just the case with MINE,' said the Hatter.\n" +
                "\n" +
                "Alice felt dreadfully puzzled. The Hatter's remark seemed to have no\n" +
                "sort of meaning in it, and yet it was certainly English. 'I don't quite\n" +
                "understand you,' she said, as politely as she could.\n" +
                "\n" +
                "'The Dormouse is asleep again,' said the Hatter, and he poured a little\n" +
                "hot tea upon its nose.\n" +
                "\n" +
                "The Dormouse shook its head impatiently, and said, without opening its\n" +
                "eyes, 'Of course, of course; just what I was going to remark myself.'\n" +
                "\n" +
                "'Have you guessed the riddle yet?' the Hatter said, turning to Alice\n" +
                "again.\n" +
                "\n" +
                "'No, I give it up,' Alice replied: 'what's the answer?'\n" +
                "\n" +
                "'I haven't the slightest idea,' said the Hatter.\n" +
                "\n" +
                "'Nor I,' said the March Hare.\n" +
                "\n" +
                "Alice sighed wearily. 'I think you might do something better with the\n" +
                "time,' she said, 'than waste it in asking riddles that have no answers.'\n" +
                "\n" +
                "'If you knew Time as well as I do,' said the Hatter, 'you wouldn't talk\n" +
                "about wasting IT. It's HIM.'\n" +
                "\n" +
                "'I don't know what you mean,' said Alice.\n" +
                "\n" +
                "'Of course you don't!' the Hatter said, tossing his head contemptuously.\n" +
                "'I dare say you never even spoke to Time!'\n" +
                "\n" +
                "'Perhaps not,' Alice cautiously replied: 'but I know I have to beat time\n" +
                "when I learn music.'\n" +
                "\n" +
                "'Ah! that accounts for it,' said the Hatter. 'He won't stand beating.\n" +
                "Now, if you only kept on good terms with him, he'd do almost anything\n" +
                "you liked with the clock. For instance, suppose it were nine o'clock in\n" +
                "the morning, just time to begin lessons: you'd only have to whisper a\n" +
                "hint to Time, and round goes the clock in a twinkling! Half-past one,\n" +
                "time for dinner!'\n" +
                "\n" +
                "('I only wish it was,' the March Hare said to itself in a whisper.)\n" +
                "\n" +
                "'That would be grand, certainly,' said Alice thoughtfully: 'but then--I\n" +
                "shouldn't be hungry for it, you know.'\n" +
                "\n" +
                "'Not at first, perhaps,' said the Hatter: 'but you could keep it to\n" +
                "half-past one as long as you liked.'\n" +
                "\n" +
                "'Is that the way YOU manage?' Alice asked.\n" +
                "\n" +
                "The Hatter shook his head mournfully. 'Not I!' he replied. 'We\n" +
                "quarrelled last March--just before HE went mad, you know--' (pointing\n" +
                "with his tea spoon at the March Hare,) '--it was at the great concert\n" +
                "given by the Queen of Hearts, and I had to sing\n" +
                "\n" +
                "     \"Twinkle, twinkle, little bat!\n" +
                "     How I wonder what you're at!\"\n" +
                "\n" +
                "You know the song, perhaps?'\n" +
                "\n" +
                "'I've heard something like it,' said Alice.\n" +
                "\n" +
                "'It goes on, you know,' the Hatter continued, 'in this way:--\n" +
                "\n" +
                "     \"Up above the world you fly,\n" +
                "     Like a tea-tray in the sky.\n" +
                "         Twinkle, twinkle--\"'\n" +
                "\n" +
                "Here the Dormouse shook itself, and began singing in its sleep 'Twinkle,\n" +
                "twinkle, twinkle, twinkle--' and went on so long that they had to pinch\n" +
                "it to make it stop.\n" +
                "\n" +
                "'Well, I'd hardly finished the first verse,' said the Hatter, 'when the\n" +
                "Queen jumped up and bawled out, \"He's murdering the time! Off with his\n" +
                "head!\"'\n" +
                "\n" +
                "'How dreadfully savage!' exclaimed Alice.\n" +
                "\n" +
                "'And ever since that,' the Hatter went on in a mournful tone, 'he won't\n" +
                "do a thing I ask! It's always six o'clock now.'\n" +
                "\n" +
                "A bright idea came into Alice's head. 'Is that the reason so many\n" +
                "tea-things are put out here?' she asked.\n" +
                "\n" +
                "'Yes, that's it,' said the Hatter with a sigh: 'it's always tea-time,\n" +
                "and we've no time to wash the things between whiles.'\n" +
                "\n" +
                "'Then you keep moving round, I suppose?' said Alice.\n" +
                "\n" +
                "'Exactly so,' said the Hatter: 'as the things get used up.'\n" +
                "\n" +
                "'But what happens when you come to the beginning again?' Alice ventured\n" +
                "to ask.\n" +
                "\n" +
                "'Suppose we change the subject,' the March Hare interrupted, yawning.\n" +
                "'I'm getting tired of this. I vote the young lady tells us a story.'\n" +
                "\n" +
                "'I'm afraid I don't know one,' said Alice, rather alarmed at the\n" +
                "proposal.\n" +
                "\n" +
                "'Then the Dormouse shall!' they both cried. 'Wake up, Dormouse!' And\n" +
                "they pinched it on both sides at once.\n" +
                "\n" +
                "The Dormouse slowly opened his eyes. 'I wasn't asleep,' he said in a\n" +
                "hoarse, feeble voice: 'I heard every word you fellows were saying.'\n" +
                "\n" +
                "'Tell us a story!' said the March Hare.\n" +
                "\n" +
                "'Yes, please do!' pleaded Alice.\n" +
                "\n" +
                "'And be quick about it,' added the Hatter, 'or you'll be asleep again\n" +
                "before it's done.'\n" +
                "\n" +
                "'Once upon a time there were three little sisters,' the Dormouse began\n" +
                "in a great hurry; 'and their names were Elsie, Lacie, and Tillie; and\n" +
                "they lived at the bottom of a well--'\n" +
                "\n" +
                "'What did they live on?' said Alice, who always took a great interest in\n" +
                "questions of eating and drinking.\n" +
                "\n" +
                "'They lived on treacle,' said the Dormouse, after thinking a minute or\n" +
                "two.\n" +
                "\n" +
                "'They couldn't have done that, you know,' Alice gently remarked; 'they'd\n" +
                "have been ill.'\n" +
                "\n" +
                "'So they were,' said the Dormouse; 'VERY ill.'\n" +
                "\n" +
                "Alice tried to fancy to herself what such an extraordinary ways of\n" +
                "living would be like, but it puzzled her too much, so she went on: 'But\n" +
                "why did they live at the bottom of a well?'\n" +
                "\n" +
                "'Take some more tea,' the March Hare said to Alice, very earnestly.\n" +
                "\n" +
                "'I've had nothing yet,' Alice replied in an offended tone, 'so I can't\n" +
                "take more.'\n" +
                "\n" +
                "'You mean you can't take LESS,' said the Hatter: 'it's very easy to take\n" +
                "MORE than nothing.'\n" +
                "\n" +
                "'Nobody asked YOUR opinion,' said Alice.\n" +
                "\n" +
                "'Who's making personal remarks now?' the Hatter asked triumphantly.\n" +
                "\n" +
                "Alice did not quite know what to say to this: so she helped herself\n" +
                "to some tea and bread-and-butter, and then turned to the Dormouse, and\n" +
                "repeated her question. 'Why did they live at the bottom of a well?'\n" +
                "\n" +
                "The Dormouse again took a minute or two to think about it, and then\n" +
                "said, 'It was a treacle-well.'\n" +
                "\n" +
                "'There's no such thing!' Alice was beginning very angrily, but the\n" +
                "Hatter and the March Hare went 'Sh! sh!' and the Dormouse sulkily\n" +
                "remarked, 'If you can't be civil, you'd better finish the story for\n" +
                "yourself.'\n" +
                "\n" +
                "'No, please go on!' Alice said very humbly; 'I won't interrupt again. I\n" +
                "dare say there may be ONE.'\n" +
                "\n" +
                "'One, indeed!' said the Dormouse indignantly. However, he consented to\n" +
                "go on. 'And so these three little sisters--they were learning to draw,\n" +
                "you know--'\n" +
                "\n" +
                "'What did they draw?' said Alice, quite forgetting her promise.\n" +
                "\n" +
                "'Treacle,' said the Dormouse, without considering at all this time.\n" +
                "\n" +
                "'I want a clean cup,' interrupted the Hatter: 'let's all move one place\n" +
                "on.'\n" +
                "\n" +
                "He moved on as he spoke, and the Dormouse followed him: the March Hare\n" +
                "moved into the Dormouse's place, and Alice rather unwillingly took\n" +
                "the place of the March Hare. The Hatter was the only one who got any\n" +
                "advantage from the change: and Alice was a good deal worse off than\n" +
                "before, as the March Hare had just upset the milk-jug into his plate.\n" +
                "\n" +
                "Alice did not wish to offend the Dormouse again, so she began very\n" +
                "cautiously: 'But I don't understand. Where did they draw the treacle\n" +
                "from?'\n" +
                "\n" +
                "'You can draw water out of a water-well,' said the Hatter; 'so I should\n" +
                "think you could draw treacle out of a treacle-well--eh, stupid?'\n" +
                "\n" +
                "'But they were IN the well,' Alice said to the Dormouse, not choosing to\n" +
                "notice this last remark.\n" +
                "\n" +
                "'Of course they were', said the Dormouse; '--well in.'\n" +
                "\n" +
                "This answer so confused poor Alice, that she let the Dormouse go on for\n" +
                "some time without interrupting it.\n" +
                "\n" +
                "'They were learning to draw,' the Dormouse went on, yawning and rubbing\n" +
                "its eyes, for it was getting very sleepy; 'and they drew all manner of\n" +
                "things--everything that begins with an M--'\n" +
                "\n" +
                "'Why with an M?' said Alice.\n" +
                "\n" +
                "'Why not?' said the March Hare.\n" +
                "\n" +
                "Alice was silent.\n" +
                "\n" +
                "The Dormouse had closed its eyes by this time, and was going off into\n" +
                "a doze; but, on being pinched by the Hatter, it woke up again with\n" +
                "a little shriek, and went on: '--that begins with an M, such as\n" +
                "mouse-traps, and the moon, and memory, and muchness--you know you say\n" +
                "things are \"much of a muchness\"--did you ever see such a thing as a\n" +
                "drawing of a muchness?'\n" +
                "\n" +
                "'Really, now you ask me,' said Alice, very much confused, 'I don't\n" +
                "think--'\n" +
                "\n" +
                "'Then you shouldn't talk,' said the Hatter.\n" +
                "\n" +
                "This piece of rudeness was more than Alice could bear: she got up in\n" +
                "great disgust, and walked off; the Dormouse fell asleep instantly, and\n" +
                "neither of the others took the least notice of her going, though she\n" +
                "looked back once or twice, half hoping that they would call after her:\n" +
                "the last time she saw them, they were trying to put the Dormouse into\n" +
                "the teapot.\n" +
                "\n" +
                "'At any rate I'll never go THERE again!' said Alice as she picked her\n" +
                "way through the wood. 'It's the stupidest tea-party I ever was at in all\n" +
                "my life!'\n" +
                "\n" +
                "Just as she said this, she noticed that one of the trees had a door\n" +
                "leading right into it. 'That's very curious!' she thought. 'But\n" +
                "everything's curious today. I think I may as well go in at once.' And in\n" +
                "she went.\n" +
                "\n" +
                "Once more she found herself in the long hall, and close to the little\n" +
                "glass table. 'Now, I'll manage better this time,' she said to herself,\n" +
                "and began by taking the little golden key, and unlocking the door that\n" +
                "led into the garden. Then she went to work nibbling at the mushroom (she\n" +
                "had kept a piece of it in her pocket) till she was about a foot high:\n" +
                "then she walked down the little passage: and THEN--she found herself at\n" +
                "last in the beautiful garden, among the bright flower-beds and the cool\n" +
                "fountains.\n" +
                "\n" +
                "\n");
        uzunString.append("CHAPTER VIII. The Queen's Croquet-Ground\n" +
                "\n" +
                "A large rose-tree stood near the entrance of the garden: the roses\n" +
                "growing on it were white, but there were three gardeners at it, busily\n" +
                "painting them red. Alice thought this a very curious thing, and she went\n" +
                "nearer to watch them, and just as she came up to them she heard one of\n" +
                "them say, 'Look out now, Five! Don't go splashing paint over me like\n" +
                "that!'\n" +
                "\n" +
                "'I couldn't help it,' said Five, in a sulky tone; 'Seven jogged my\n" +
                "elbow.'\n" +
                "\n" +
                "On which Seven looked up and said, 'That's right, Five! Always lay the\n" +
                "blame on others!'\n" +
                "\n" +
                "'YOU'D better not talk!' said Five. 'I heard the Queen say only\n" +
                "yesterday you deserved to be beheaded!'\n" +
                "\n" +
                "'What for?' said the one who had spoken first.\n" +
                "\n" +
                "'That's none of YOUR business, Two!' said Seven.\n" +
                "\n" +
                "'Yes, it IS his business!' said Five, 'and I'll tell him--it was for\n" +
                "bringing the cook tulip-roots instead of onions.'\n" +
                "\n" +
                "Seven flung down his brush, and had just begun 'Well, of all the unjust\n" +
                "things--' when his eye chanced to fall upon Alice, as she stood watching\n" +
                "them, and he checked himself suddenly: the others looked round also, and\n" +
                "all of them bowed low.\n" +
                "\n" +
                "'Would you tell me,' said Alice, a little timidly, 'why you are painting\n" +
                "those roses?'\n" +
                "\n" +
                "Five and Seven said nothing, but looked at Two. Two began in a low\n" +
                "voice, 'Why the fact is, you see, Miss, this here ought to have been a\n" +
                "RED rose-tree, and we put a white one in by mistake; and if the Queen\n" +
                "was to find it out, we should all have our heads cut off, you know.\n" +
                "So you see, Miss, we're doing our best, afore she comes, to--' At this\n" +
                "moment Five, who had been anxiously looking across the garden, called\n" +
                "out 'The Queen! The Queen!' and the three gardeners instantly threw\n" +
                "themselves flat upon their faces. There was a sound of many footsteps,\n" +
                "and Alice looked round, eager to see the Queen.\n" +
                "\n" +
                "First came ten soldiers carrying clubs; these were all shaped like\n" +
                "the three gardeners, oblong and flat, with their hands and feet at the\n" +
                "corners: next the ten courtiers; these were ornamented all over with\n" +
                "diamonds, and walked two and two, as the soldiers did. After these came\n" +
                "the royal children; there were ten of them, and the little dears came\n" +
                "jumping merrily along hand in hand, in couples: they were all ornamented\n" +
                "with hearts. Next came the guests, mostly Kings and Queens, and among\n" +
                "them Alice recognised the White Rabbit: it was talking in a hurried\n" +
                "nervous manner, smiling at everything that was said, and went by without\n" +
                "noticing her. Then followed the Knave of Hearts, carrying the King's\n" +
                "crown on a crimson velvet cushion; and, last of all this grand\n" +
                "procession, came THE KING AND QUEEN OF HEARTS.\n" +
                "\n" +
                "Alice was rather doubtful whether she ought not to lie down on her face\n" +
                "like the three gardeners, but she could not remember ever having heard\n" +
                "of such a rule at processions; 'and besides, what would be the use of\n" +
                "a procession,' thought she, 'if people had all to lie down upon their\n" +
                "faces, so that they couldn't see it?' So she stood still where she was,\n" +
                "and waited.\n" +
                "\n" +
                "When the procession came opposite to Alice, they all stopped and looked\n" +
                "at her, and the Queen said severely 'Who is this?' She said it to the\n" +
                "Knave of Hearts, who only bowed and smiled in reply.\n" +
                "\n" +
                "'Idiot!' said the Queen, tossing her head impatiently; and, turning to\n" +
                "Alice, she went on, 'What's your name, child?'\n" +
                "\n" +
                "'My name is Alice, so please your Majesty,' said Alice very politely;\n" +
                "but she added, to herself, 'Why, they're only a pack of cards, after\n" +
                "all. I needn't be afraid of them!'\n" +
                "\n" +
                "'And who are THESE?' said the Queen, pointing to the three gardeners who\n" +
                "were lying round the rosetree; for, you see, as they were lying on their\n" +
                "faces, and the pattern on their backs was the same as the rest of the\n" +
                "pack, she could not tell whether they were gardeners, or soldiers, or\n" +
                "courtiers, or three of her own children.\n" +
                "\n" +
                "'How should I know?' said Alice, surprised at her own courage. 'It's no\n" +
                "business of MINE.'\n" +
                "\n" +
                "The Queen turned crimson with fury, and, after glaring at her for a\n" +
                "moment like a wild beast, screamed 'Off with her head! Off--'\n" +
                "\n" +
                "'Nonsense!' said Alice, very loudly and decidedly, and the Queen was\n" +
                "silent.\n" +
                "\n" +
                "The King laid his hand upon her arm, and timidly said 'Consider, my\n" +
                "dear: she is only a child!'\n" +
                "\n" +
                "The Queen turned angrily away from him, and said to the Knave 'Turn them\n" +
                "over!'\n" +
                "\n" +
                "The Knave did so, very carefully, with one foot.\n" +
                "\n" +
                "'Get up!' said the Queen, in a shrill, loud voice, and the three\n" +
                "gardeners instantly jumped up, and began bowing to the King, the Queen,\n" +
                "the royal children, and everybody else.\n" +
                "\n" +
                "'Leave off that!' screamed the Queen. 'You make me giddy.' And then,\n" +
                "turning to the rose-tree, she went on, 'What HAVE you been doing here?'\n" +
                "\n" +
                "'May it please your Majesty,' said Two, in a very humble tone, going\n" +
                "down on one knee as he spoke, 'we were trying--'\n" +
                "\n" +
                "'I see!' said the Queen, who had meanwhile been examining the roses.\n" +
                "'Off with their heads!' and the procession moved on, three of the\n" +
                "soldiers remaining behind to execute the unfortunate gardeners, who ran\n" +
                "to Alice for protection.\n" +
                "\n" +
                "'You shan't be beheaded!' said Alice, and she put them into a large\n" +
                "flower-pot that stood near. The three soldiers wandered about for a\n" +
                "minute or two, looking for them, and then quietly marched off after the\n" +
                "others.\n" +
                "\n" +
                "'Are their heads off?' shouted the Queen.\n" +
                "\n" +
                "'Their heads are gone, if it please your Majesty!' the soldiers shouted\n" +
                "in reply.\n" +
                "\n" +
                "'That's right!' shouted the Queen. 'Can you play croquet?'\n" +
                "\n" +
                "The soldiers were silent, and looked at Alice, as the question was\n" +
                "evidently meant for her.\n" +
                "\n" +
                "'Yes!' shouted Alice.\n" +
                "\n" +
                "'Come on, then!' roared the Queen, and Alice joined the procession,\n" +
                "wondering very much what would happen next.\n" +
                "\n" +
                "'It's--it's a very fine day!' said a timid voice at her side. She was\n" +
                "walking by the White Rabbit, who was peeping anxiously into her face.\n" +
                "\n" +
                "'Very,' said Alice: '--where's the Duchess?'\n" +
                "\n" +
                "'Hush! Hush!' said the Rabbit in a low, hurried tone. He looked\n" +
                "anxiously over his shoulder as he spoke, and then raised himself upon\n" +
                "tiptoe, put his mouth close to her ear, and whispered 'She's under\n" +
                "sentence of execution.'\n" +
                "\n" +
                "'What for?' said Alice.\n" +
                "\n" +
                "'Did you say \"What a pity!\"?' the Rabbit asked.\n" +
                "\n" +
                "'No, I didn't,' said Alice: 'I don't think it's at all a pity. I said\n" +
                "\"What for?\"'\n" +
                "\n" +
                "'She boxed the Queen's ears--' the Rabbit began. Alice gave a little\n" +
                "scream of laughter. 'Oh, hush!' the Rabbit whispered in a frightened\n" +
                "tone. 'The Queen will hear you! You see, she came rather late, and the\n" +
                "Queen said--'\n" +
                "\n" +
                "'Get to your places!' shouted the Queen in a voice of thunder, and\n" +
                "people began running about in all directions, tumbling up against each\n" +
                "other; however, they got settled down in a minute or two, and the game\n" +
                "began. Alice thought she had never seen such a curious croquet-ground in\n" +
                "her life; it was all ridges and furrows; the balls were live hedgehogs,\n" +
                "the mallets live flamingoes, and the soldiers had to double themselves\n" +
                "up and to stand on their hands and feet, to make the arches.\n" +
                "\n" +
                "The chief difficulty Alice found at first was in managing her flamingo:\n" +
                "she succeeded in getting its body tucked away, comfortably enough, under\n" +
                "her arm, with its legs hanging down, but generally, just as she had got\n" +
                "its neck nicely straightened out, and was going to give the hedgehog a\n" +
                "blow with its head, it WOULD twist itself round and look up in her face,\n" +
                "with such a puzzled expression that she could not help bursting out\n" +
                "laughing: and when she had got its head down, and was going to begin\n" +
                "again, it was very provoking to find that the hedgehog had unrolled\n" +
                "itself, and was in the act of crawling away: besides all this, there was\n" +
                "generally a ridge or furrow in the way wherever she wanted to send the\n" +
                "hedgehog to, and, as the doubled-up soldiers were always getting up\n" +
                "and walking off to other parts of the ground, Alice soon came to the\n" +
                "conclusion that it was a very difficult game indeed.\n" +
                "\n" +
                "The players all played at once without waiting for turns, quarrelling\n" +
                "all the while, and fighting for the hedgehogs; and in a very short\n" +
                "time the Queen was in a furious passion, and went stamping about, and\n" +
                "shouting 'Off with his head!' or 'Off with her head!' about once in a\n" +
                "minute.\n" +
                "\n" +
                "Alice began to feel very uneasy: to be sure, she had not as yet had any\n" +
                "dispute with the Queen, but she knew that it might happen any minute,\n" +
                "'and then,' thought she, 'what would become of me? They're dreadfully\n" +
                "fond of beheading people here; the great wonder is, that there's any one\n" +
                "left alive!'\n" +
                "\n" +
                "She was looking about for some way of escape, and wondering whether she\n" +
                "could get away without being seen, when she noticed a curious appearance\n" +
                "in the air: it puzzled her very much at first, but, after watching it\n" +
                "a minute or two, she made it out to be a grin, and she said to herself\n" +
                "'It's the Cheshire Cat: now I shall have somebody to talk to.'\n" +
                "\n" +
                "'How are you getting on?' said the Cat, as soon as there was mouth\n" +
                "enough for it to speak with.\n" +
                "\n" +
                "Alice waited till the eyes appeared, and then nodded. 'It's no use\n" +
                "speaking to it,' she thought, 'till its ears have come, or at least one\n" +
                "of them.' In another minute the whole head appeared, and then Alice put\n" +
                "down her flamingo, and began an account of the game, feeling very glad\n" +
                "she had someone to listen to her. The Cat seemed to think that there was\n" +
                "enough of it now in sight, and no more of it appeared.\n" +
                "\n" +
                "'I don't think they play at all fairly,' Alice began, in rather a\n" +
                "complaining tone, 'and they all quarrel so dreadfully one can't hear\n" +
                "oneself speak--and they don't seem to have any rules in particular;\n" +
                "at least, if there are, nobody attends to them--and you've no idea how\n" +
                "confusing it is all the things being alive; for instance, there's the\n" +
                "arch I've got to go through next walking about at the other end of the\n" +
                "ground--and I should have croqueted the Queen's hedgehog just now, only\n" +
                "it ran away when it saw mine coming!'\n" +
                "\n" +
                "'How do you like the Queen?' said the Cat in a low voice.\n" +
                "\n" +
                "'Not at all,' said Alice: 'she's so extremely--' Just then she noticed\n" +
                "that the Queen was close behind her, listening: so she went on,\n" +
                "'--likely to win, that it's hardly worth while finishing the game.'\n" +
                "\n" +
                "The Queen smiled and passed on.\n" +
                "\n" +
                "'Who ARE you talking to?' said the King, going up to Alice, and looking\n" +
                "at the Cat's head with great curiosity.\n" +
                "\n" +
                "'It's a friend of mine--a Cheshire Cat,' said Alice: 'allow me to\n" +
                "introduce it.'\n" +
                "\n" +
                "'I don't like the look of it at all,' said the King: 'however, it may\n" +
                "kiss my hand if it likes.'\n" +
                "\n" +
                "'I'd rather not,' the Cat remarked.\n" +
                "\n" +
                "'Don't be impertinent,' said the King, 'and don't look at me like that!'\n" +
                "He got behind Alice as he spoke.\n" +
                "\n" +
                "'A cat may look at a king,' said Alice. 'I've read that in some book,\n" +
                "but I don't remember where.'\n" +
                "\n" +
                "'Well, it must be removed,' said the King very decidedly, and he called\n" +
                "the Queen, who was passing at the moment, 'My dear! I wish you would\n" +
                "have this cat removed!'\n" +
                "\n" +
                "The Queen had only one way of settling all difficulties, great or small.\n" +
                "'Off with his head!' she said, without even looking round.\n" +
                "\n" +
                "'I'll fetch the executioner myself,' said the King eagerly, and he\n" +
                "hurried off.\n" +
                "\n" +
                "Alice thought she might as well go back, and see how the game was going\n" +
                "on, as she heard the Queen's voice in the distance, screaming with\n" +
                "passion. She had already heard her sentence three of the players to be\n" +
                "executed for having missed their turns, and she did not like the look\n" +
                "of things at all, as the game was in such confusion that she never knew\n" +
                "whether it was her turn or not. So she went in search of her hedgehog.\n" +
                "\n" +
                "The hedgehog was engaged in a fight with another hedgehog, which seemed\n" +
                "to Alice an excellent opportunity for croqueting one of them with the\n" +
                "other: the only difficulty was, that her flamingo was gone across to the\n" +
                "other side of the garden, where Alice could see it trying in a helpless\n" +
                "sort of way to fly up into a tree.\n" +
                "\n" +
                "By the time she had caught the flamingo and brought it back, the fight\n" +
                "was over, and both the hedgehogs were out of sight: 'but it doesn't\n" +
                "matter much,' thought Alice, 'as all the arches are gone from this side\n" +
                "of the ground.' So she tucked it away under her arm, that it might not\n" +
                "escape again, and went back for a little more conversation with her\n" +
                "friend.\n" +
                "\n" +
                "When she got back to the Cheshire Cat, she was surprised to find quite a\n" +
                "large crowd collected round it: there was a dispute going on between\n" +
                "the executioner, the King, and the Queen, who were all talking at once,\n" +
                "while all the rest were quite silent, and looked very uncomfortable.\n" +
                "\n" +
                "The moment Alice appeared, she was appealed to by all three to settle\n" +
                "the question, and they repeated their arguments to her, though, as they\n" +
                "all spoke at once, she found it very hard indeed to make out exactly\n" +
                "what they said.\n" +
                "\n" +
                "The executioner's argument was, that you couldn't cut off a head unless\n" +
                "there was a body to cut it off from: that he had never had to do such a\n" +
                "thing before, and he wasn't going to begin at HIS time of life.\n" +
                "\n" +
                "The King's argument was, that anything that had a head could be\n" +
                "beheaded, and that you weren't to talk nonsense.\n" +
                "\n" +
                "The Queen's argument was, that if something wasn't done about it in less\n" +
                "than no time she'd have everybody executed, all round. (It was this last\n" +
                "remark that had made the whole party look so grave and anxious.)\n" +
                "\n" +
                "Alice could think of nothing else to say but 'It belongs to the Duchess:\n" +
                "you'd better ask HER about it.'\n" +
                "\n" +
                "'She's in prison,' the Queen said to the executioner: 'fetch her here.'\n" +
                "And the executioner went off like an arrow.\n" +
                "\n" +
                " The Cat's head began fading away the moment he was gone, and,\n" +
                "by the time he had come back with the Duchess, it had entirely\n" +
                "disappeared; so the King and the executioner ran wildly up and down\n" +
                "looking for it, while the rest of the party went back to the game.\n" +
                "\n" +
                "\n" +
                "\n");
        uzunString.append("CHAPTER IX. The Mock Turtle's Story\n" +
                "\n" +
                "'You can't think how glad I am to see you again, you dear old thing!'\n" +
                "said the Duchess, as she tucked her arm affectionately into Alice's, and\n" +
                "they walked off together.\n" +
                "\n" +
                "Alice was very glad to find her in such a pleasant temper, and thought\n" +
                "to herself that perhaps it was only the pepper that had made her so\n" +
                "savage when they met in the kitchen.\n" +
                "\n" +
                "'When I'M a Duchess,' she said to herself, (not in a very hopeful tone\n" +
                "though), 'I won't have any pepper in my kitchen AT ALL. Soup does very\n" +
                "well without--Maybe it's always pepper that makes people hot-tempered,'\n" +
                "she went on, very much pleased at having found out a new kind of\n" +
                "rule, 'and vinegar that makes them sour--and camomile that makes\n" +
                "them bitter--and--and barley-sugar and such things that make children\n" +
                "sweet-tempered. I only wish people knew that: then they wouldn't be so\n" +
                "stingy about it, you know--'\n" +
                "\n" +
                "She had quite forgotten the Duchess by this time, and was a little\n" +
                "startled when she heard her voice close to her ear. 'You're thinking\n" +
                "about something, my dear, and that makes you forget to talk. I can't\n" +
                "tell you just now what the moral of that is, but I shall remember it in\n" +
                "a bit.'\n" +
                "\n" +
                "'Perhaps it hasn't one,' Alice ventured to remark.\n" +
                "\n" +
                "'Tut, tut, child!' said the Duchess. 'Everything's got a moral, if only\n" +
                "you can find it.' And she squeezed herself up closer to Alice's side as\n" +
                "she spoke.\n" +
                "\n" +
                "Alice did not much like keeping so close to her: first, because the\n" +
                "Duchess was VERY ugly; and secondly, because she was exactly the\n" +
                "right height to rest her chin upon Alice's shoulder, and it was an\n" +
                "uncomfortably sharp chin. However, she did not like to be rude, so she\n" +
                "bore it as well as she could.\n" +
                "\n" +
                "'The game's going on rather better now,' she said, by way of keeping up\n" +
                "the conversation a little.\n" +
                "\n" +
                "''Tis so,' said the Duchess: 'and the moral of that is--\"Oh, 'tis love,\n" +
                "'tis love, that makes the world go round!\"'\n" +
                "\n" +
                "'Somebody said,' Alice whispered, 'that it's done by everybody minding\n" +
                "their own business!'\n" +
                "\n" +
                "'Ah, well! It means much the same thing,' said the Duchess, digging her\n" +
                "sharp little chin into Alice's shoulder as she added, 'and the moral\n" +
                "of THAT is--\"Take care of the sense, and the sounds will take care of\n" +
                "themselves.\"'\n" +
                "\n" +
                "'How fond she is of finding morals in things!' Alice thought to herself.\n" +
                "\n" +
                "'I dare say you're wondering why I don't put my arm round your waist,'\n" +
                "the Duchess said after a pause: 'the reason is, that I'm doubtful about\n" +
                "the temper of your flamingo. Shall I try the experiment?'\n" +
                "\n" +
                "'HE might bite,' Alice cautiously replied, not feeling at all anxious to\n" +
                "have the experiment tried.\n" +
                "\n" +
                "'Very true,' said the Duchess: 'flamingoes and mustard both bite. And\n" +
                "the moral of that is--\"Birds of a feather flock together.\"'\n" +
                "\n" +
                "'Only mustard isn't a bird,' Alice remarked.\n" +
                "\n" +
                "'Right, as usual,' said the Duchess: 'what a clear way you have of\n" +
                "putting things!'\n" +
                "\n" +
                "'It's a mineral, I THINK,' said Alice.\n" +
                "\n" +
                "'Of course it is,' said the Duchess, who seemed ready to agree to\n" +
                "everything that Alice said; 'there's a large mustard-mine near here. And\n" +
                "the moral of that is--\"The more there is of mine, the less there is of\n" +
                "yours.\"'\n" +
                "\n" +
                "'Oh, I know!' exclaimed Alice, who had not attended to this last remark,\n" +
                "'it's a vegetable. It doesn't look like one, but it is.'\n" +
                "\n" +
                "'I quite agree with you,' said the Duchess; 'and the moral of that\n" +
                "is--\"Be what you would seem to be\"--or if you'd like it put more\n" +
                "simply--\"Never imagine yourself not to be otherwise than what it might\n" +
                "appear to others that what you were or might have been was not otherwise\n" +
                "than what you had been would have appeared to them to be otherwise.\"'\n" +
                "\n" +
                "'I think I should understand that better,' Alice said very politely, 'if\n" +
                "I had it written down: but I can't quite follow it as you say it.'\n" +
                "\n" +
                "'That's nothing to what I could say if I chose,' the Duchess replied, in\n" +
                "a pleased tone.\n" +
                "\n" +
                "'Pray don't trouble yourself to say it any longer than that,' said\n" +
                "Alice.\n" +
                "\n" +
                "'Oh, don't talk about trouble!' said the Duchess. 'I make you a present\n" +
                "of everything I've said as yet.'\n" +
                "\n" +
                "'A cheap sort of present!' thought Alice. 'I'm glad they don't give\n" +
                "birthday presents like that!' But she did not venture to say it out\n" +
                "loud.\n" +
                "\n" +
                "'Thinking again?' the Duchess asked, with another dig of her sharp\n" +
                "little chin.\n" +
                "\n" +
                "'I've a right to think,' said Alice sharply, for she was beginning to\n" +
                "feel a little worried.\n" +
                "\n" +
                "'Just about as much right,' said the Duchess, 'as pigs have to fly; and\n" +
                "the m--'\n" +
                "\n" +
                "But here, to Alice's great surprise, the Duchess's voice died away, even\n" +
                "in the middle of her favourite word 'moral,' and the arm that was linked\n" +
                "into hers began to tremble. Alice looked up, and there stood the Queen\n" +
                "in front of them, with her arms folded, frowning like a thunderstorm.\n" +
                "\n" +
                "'A fine day, your Majesty!' the Duchess began in a low, weak voice.\n" +
                "\n" +
                "'Now, I give you fair warning,' shouted the Queen, stamping on the\n" +
                "ground as she spoke; 'either you or your head must be off, and that in\n" +
                "about half no time! Take your choice!'\n" +
                "\n" +
                "The Duchess took her choice, and was gone in a moment.\n" +
                "\n" +
                "'Let's go on with the game,' the Queen said to Alice; and Alice was\n" +
                "too much frightened to say a word, but slowly followed her back to the\n" +
                "croquet-ground.\n" +
                "\n" +
                "The other guests had taken advantage of the Queen's absence, and were\n" +
                "resting in the shade: however, the moment they saw her, they hurried\n" +
                "back to the game, the Queen merely remarking that a moment's delay would\n" +
                "cost them their lives.\n" +
                "\n" +
                "All the time they were playing the Queen never left off quarrelling with\n" +
                "the other players, and shouting 'Off with his head!' or 'Off with her\n" +
                "head!' Those whom she sentenced were taken into custody by the soldiers,\n" +
                "who of course had to leave off being arches to do this, so that by\n" +
                "the end of half an hour or so there were no arches left, and all the\n" +
                "players, except the King, the Queen, and Alice, were in custody and\n" +
                "under sentence of execution.\n" +
                "\n" +
                "Then the Queen left off, quite out of breath, and said to Alice, 'Have\n" +
                "you seen the Mock Turtle yet?'\n" +
                "\n" +
                "'No,' said Alice. 'I don't even know what a Mock Turtle is.'\n" +
                "\n" +
                "'It's the thing Mock Turtle Soup is made from,' said the Queen.\n" +
                "\n" +
                "'I never saw one, or heard of one,' said Alice.\n" +
                "\n" +
                "'Come on, then,' said the Queen, 'and he shall tell you his history,'\n" +
                "\n" +
                "As they walked off together, Alice heard the King say in a low voice,\n" +
                "to the company generally, 'You are all pardoned.' 'Come, THAT'S a good\n" +
                "thing!' she said to herself, for she had felt quite unhappy at the\n" +
                "number of executions the Queen had ordered.\n" +
                "\n" +
                "They very soon came upon a Gryphon, lying fast asleep in the sun.\n" +
                "(IF you don't know what a Gryphon is, look at the picture.) 'Up, lazy\n" +
                "thing!' said the Queen, 'and take this young lady to see the Mock\n" +
                "Turtle, and to hear his history. I must go back and see after some\n" +
                "executions I have ordered'; and she walked off, leaving Alice alone with\n" +
                "the Gryphon. Alice did not quite like the look of the creature, but on\n" +
                "the whole she thought it would be quite as safe to stay with it as to go\n" +
                "after that savage Queen: so she waited.\n" +
                "\n" +
                "The Gryphon sat up and rubbed its eyes: then it watched the Queen till\n" +
                "she was out of sight: then it chuckled. 'What fun!' said the Gryphon,\n" +
                "half to itself, half to Alice.\n" +
                "\n" +
                "'What IS the fun?' said Alice.\n" +
                "\n" +
                "'Why, SHE,' said the Gryphon. 'It's all her fancy, that: they never\n" +
                "executes nobody, you know. Come on!'\n" +
                "\n" +
                "'Everybody says \"come on!\" here,' thought Alice, as she went slowly\n" +
                "after it: 'I never was so ordered about in all my life, never!'\n" +
                "\n" +
                "They had not gone far before they saw the Mock Turtle in the distance,\n" +
                "sitting sad and lonely on a little ledge of rock, and, as they came\n" +
                "nearer, Alice could hear him sighing as if his heart would break. She\n" +
                "pitied him deeply. 'What is his sorrow?' she asked the Gryphon, and the\n" +
                "Gryphon answered, very nearly in the same words as before, 'It's all his\n" +
                "fancy, that: he hasn't got no sorrow, you know. Come on!'\n" +
                "\n" +
                "So they went up to the Mock Turtle, who looked at them with large eyes\n" +
                "full of tears, but said nothing.\n" +
                "\n" +
                "'This here young lady,' said the Gryphon, 'she wants for to know your\n" +
                "history, she do.'\n" +
                "\n" +
                "'I'll tell it her,' said the Mock Turtle in a deep, hollow tone: 'sit\n" +
                "down, both of you, and don't speak a word till I've finished.'\n" +
                "\n" +
                "So they sat down, and nobody spoke for some minutes. Alice thought to\n" +
                "herself, 'I don't see how he can EVEN finish, if he doesn't begin.' But\n" +
                "she waited patiently.\n" +
                "\n" +
                "'Once,' said the Mock Turtle at last, with a deep sigh, 'I was a real\n" +
                "Turtle.'\n" +
                "\n" +
                "These words were followed by a very long silence, broken only by an\n" +
                "occasional exclamation of 'Hjckrrh!' from the Gryphon, and the constant\n" +
                "heavy sobbing of the Mock Turtle. Alice was very nearly getting up and\n" +
                "saying, 'Thank you, sir, for your interesting story,' but she could\n" +
                "not help thinking there MUST be more to come, so she sat still and said\n" +
                "nothing.\n" +
                "\n" +
                "'When we were little,' the Mock Turtle went on at last, more calmly,\n" +
                "though still sobbing a little now and then, 'we went to school in the\n" +
                "sea. The master was an old Turtle--we used to call him Tortoise--'\n" +
                "\n" +
                "'Why did you call him Tortoise, if he wasn't one?' Alice asked.\n" +
                "\n" +
                "'We called him Tortoise because he taught us,' said the Mock Turtle\n" +
                "angrily: 'really you are very dull!'\n" +
                "\n" +
                "'You ought to be ashamed of yourself for asking such a simple question,'\n" +
                "added the Gryphon; and then they both sat silent and looked at poor\n" +
                "Alice, who felt ready to sink into the earth. At last the Gryphon said\n" +
                "to the Mock Turtle, 'Drive on, old fellow! Don't be all day about it!'\n" +
                "and he went on in these words:\n" +
                "\n" +
                "'Yes, we went to school in the sea, though you mayn't believe it--'\n" +
                "\n" +
                "'I never said I didn't!' interrupted Alice.\n" +
                "\n" +
                "'You did,' said the Mock Turtle.\n" +
                "\n" +
                "'Hold your tongue!' added the Gryphon, before Alice could speak again.\n" +
                "The Mock Turtle went on.\n" +
                "\n" +
                "'We had the best of educations--in fact, we went to school every day--'\n" +
                "\n" +
                "'I'VE been to a day-school, too,' said Alice; 'you needn't be so proud\n" +
                "as all that.'\n" +
                "\n" +
                "'With extras?' asked the Mock Turtle a little anxiously.\n" +
                "\n" +
                "'Yes,' said Alice, 'we learned French and music.'\n" +
                "\n" +
                "'And washing?' said the Mock Turtle.\n" +
                "\n" +
                "'Certainly not!' said Alice indignantly.\n" +
                "\n" +
                "'Ah! then yours wasn't a really good school,' said the Mock Turtle in\n" +
                "a tone of great relief. 'Now at OURS they had at the end of the bill,\n" +
                "\"French, music, AND WASHING--extra.\"'\n" +
                "\n" +
                "'You couldn't have wanted it much,' said Alice; 'living at the bottom of\n" +
                "the sea.'\n" +
                "\n" +
                "'I couldn't afford to learn it.' said the Mock Turtle with a sigh. 'I\n" +
                "only took the regular course.'\n" +
                "\n" +
                "'What was that?' inquired Alice.\n" +
                "\n" +
                "'Reeling and Writhing, of course, to begin with,' the Mock Turtle\n" +
                "replied; 'and then the different branches of Arithmetic--Ambition,\n" +
                "Distraction, Uglification, and Derision.'\n" +
                "\n" +
                "'I never heard of \"Uglification,\"' Alice ventured to say. 'What is it?'\n" +
                "\n" +
                "The Gryphon lifted up both its paws in surprise. 'What! Never heard of\n" +
                "uglifying!' it exclaimed. 'You know what to beautify is, I suppose?'\n" +
                "\n" +
                "'Yes,' said Alice doubtfully: 'it means--to--make--anything--prettier.'\n" +
                "\n" +
                "'Well, then,' the Gryphon went on, 'if you don't know what to uglify is,\n" +
                "you ARE a simpleton.'\n" +
                "\n" +
                "Alice did not feel encouraged to ask any more questions about it, so she\n" +
                "turned to the Mock Turtle, and said 'What else had you to learn?'\n" +
                "\n" +
                "'Well, there was Mystery,' the Mock Turtle replied, counting off\n" +
                "the subjects on his flappers, '--Mystery, ancient and modern, with\n" +
                "Seaography: then Drawling--the Drawling-master was an old conger-eel,\n" +
                "that used to come once a week: HE taught us Drawling, Stretching, and\n" +
                "Fainting in Coils.'\n" +
                "\n" +
                "'What was THAT like?' said Alice.\n" +
                "\n" +
                "'Well, I can't show it you myself,' the Mock Turtle said: 'I'm too\n" +
                "stiff. And the Gryphon never learnt it.'\n" +
                "\n" +
                "'Hadn't time,' said the Gryphon: 'I went to the Classics master, though.\n" +
                "He was an old crab, HE was.'\n" +
                "\n" +
                "'I never went to him,' the Mock Turtle said with a sigh: 'he taught\n" +
                "Laughing and Grief, they used to say.'\n" +
                "\n" +
                "'So he did, so he did,' said the Gryphon, sighing in his turn; and both\n" +
                "creatures hid their faces in their paws.\n" +
                "\n" +
                "'And how many hours a day did you do lessons?' said Alice, in a hurry to\n" +
                "change the subject.\n" +
                "\n" +
                "'Ten hours the first day,' said the Mock Turtle: 'nine the next, and so\n" +
                "on.'\n" +
                "\n" +
                "'What a curious plan!' exclaimed Alice.\n" +
                "\n" +
                "'That's the reason they're called lessons,' the Gryphon remarked:\n" +
                "'because they lessen from day to day.'\n" +
                "\n" +
                "This was quite a new idea to Alice, and she thought it over a little\n" +
                "before she made her next remark. 'Then the eleventh day must have been a\n" +
                "holiday?'\n" +
                "\n" +
                "'Of course it was,' said the Mock Turtle.\n" +
                "\n" +
                "'And how did you manage on the twelfth?' Alice went on eagerly.\n" +
                "\n" +
                "'That's enough about lessons,' the Gryphon interrupted in a very decided\n" +
                "tone: 'tell her something about the games now.'\n" +
                "\n");
        uzunString.append("\"CHAPTER X. The Lobster Quadrille\n" +
                "\n" +
                "The Mock Turtle sighed deeply, and drew the back of one flapper across\n" +
                "his eyes. He looked at Alice, and tried to speak, but for a minute or\n" +
                "two sobs choked his voice. 'Same as if he had a bone in his throat,'\n" +
                "said the Gryphon: and it set to work shaking him and punching him in\n" +
                "the back. At last the Mock Turtle recovered his voice, and, with tears\n" +
                "running down his cheeks, he went on again:--\n" +
                "\n" +
                "'You may not have lived much under the sea--' ('I haven't,' said\n" +
                "Alice)--'and perhaps you were never even introduced to a lobster--'\n" +
                "(Alice began to say 'I once tasted--' but checked herself hastily, and\n" +
                "said 'No, never') '--so you can have no idea what a delightful thing a\n" +
                "Lobster Quadrille is!'\n" +
                "\n" +
                "'No, indeed,' said Alice. 'What sort of a dance is it?'\n" +
                "\n" +
                "'Why,' said the Gryphon, 'you first form into a line along the\n" +
                "sea-shore--'\n" +
                "\n" +
                "'Two lines!' cried the Mock Turtle. 'Seals, turtles, salmon, and so on;\n" +
                "then, when you've cleared all the jelly-fish out of the way--'\n" +
                "\n" +
                "'THAT generally takes some time,' interrupted the Gryphon.\n" +
                "\n" +
                "'--you advance twice--'\n" +
                "\n" +
                "'Each with a lobster as a partner!' cried the Gryphon.\n" +
                "\n" +
                "'Of course,' the Mock Turtle said: 'advance twice, set to partners--'\n" +
                "\n" +
                "'--change lobsters, and retire in same order,' continued the Gryphon.\n" +
                "\n" +
                "'Then, you know,' the Mock Turtle went on, 'you throw the--'\n" +
                "\n" +
                "'The lobsters!' shouted the Gryphon, with a bound into the air.\n" +
                "\n" +
                "'--as far out to sea as you can--'\n" +
                "\n" +
                "'Swim after them!' screamed the Gryphon.\n" +
                "\n" +
                "'Turn a somersault in the sea!' cried the Mock Turtle, capering wildly\n" +
                "about.\n" +
                "\n" +
                "'Change lobsters again!' yelled the Gryphon at the top of its voice.\n" +
                "\n" +
                "'Back to land again, and that's all the first figure,' said the Mock\n" +
                "Turtle, suddenly dropping his voice; and the two creatures, who had been\n" +
                "jumping about like mad things all this time, sat down again very sadly\n" +
                "and quietly, and looked at Alice.\n" +
                "\n" +
                "'It must be a very pretty dance,' said Alice timidly.\n" +
                "\n" +
                "'Would you like to see a little of it?' said the Mock Turtle.\n" +
                "\n" +
                "'Very much indeed,' said Alice.\n" +
                "\n" +
                "'Come, let's try the first figure!' said the Mock Turtle to the Gryphon.\n" +
                "'We can do without lobsters, you know. Which shall sing?'\n" +
                "\n" +
                "'Oh, YOU sing,' said the Gryphon. 'I've forgotten the words.'\n" +
                "\n" +
                "So they began solemnly dancing round and round Alice, every now and\n" +
                "then treading on her toes when they passed too close, and waving their\n" +
                "forepaws to mark the time, while the Mock Turtle sang this, very slowly\n" +
                "and sadly:--\n" +
                "\n" +
                " '\"Will you walk a little faster?\" said a whiting to a snail.\n" +
                " \"There's a porpoise close behind us, and he's treading on my tail.\n" +
                "\n" +
                " See how eagerly the lobsters and the turtles all advance!\n" +
                " They are waiting on the shingle--will you come and join the dance?\n" +
                "\n" +
                " Will you, won't you, will you, won't you, will you join the dance?\n" +
                " Will you, won't you, will you, won't you, won't you join the dance?\n" +
                "\n" +
                " \"You can really have no notion how delightful it will be\n" +
                " When they take us up and throw us, with the lobsters, out to sea!\"\n" +
                " But the snail replied \"Too far, too far!\" and gave a look askance--\n" +
                " Said he thanked the whiting kindly, but he would not join the dance.\n" +
                "\n" +
                " Would not, could not, would not, could not, would not join the dance.\n" +
                " Would not, could not, would not, could not, could not join the dance.\n" +
                "\n" +
                " '\"What matters it how far we go?\" his scaly friend replied.\n" +
                " \"There is another shore, you know, upon the other side.\n" +
                " The further off from England the nearer is to France--\n" +
                " Then turn not pale, beloved snail, but come and join the dance.\n" +
                "\n" +
                " Will you, won't you, will you, won't you, will you join the dance?\n" +
                " Will you, won't you, will you, won't you, won't you join the dance?\"'\n" +
                "\n" +
                "'Thank you, it's a very interesting dance to watch,' said Alice, feeling\n" +
                "very glad that it was over at last: 'and I do so like that curious song\n" +
                "about the whiting!'\n" +
                "\n" +
                "'Oh, as to the whiting,' said the Mock Turtle, 'they--you've seen them,\n" +
                "of course?'\n" +
                "\n" +
                "'Yes,' said Alice, 'I've often seen them at dinn--' she checked herself\n" +
                "hastily.\n" +
                "\n" +
                "'I don't know where Dinn may be,' said the Mock Turtle, 'but if you've\n" +
                "seen them so often, of course you know what they're like.'\n" +
                "\n" +
                "'I believe so,' Alice replied thoughtfully. 'They have their tails in\n" +
                "their mouths--and they're all over crumbs.'\n" +
                "\n" +
                "'You're wrong about the crumbs,' said the Mock Turtle: 'crumbs would all\n" +
                "wash off in the sea. But they HAVE their tails in their mouths; and the\n" +
                "reason is--' here the Mock Turtle yawned and shut his eyes.--'Tell her\n" +
                "about the reason and all that,' he said to the Gryphon.\n" +
                "\n" +
                "'The reason is,' said the Gryphon, 'that they WOULD go with the lobsters\n" +
                "to the dance. So they got thrown out to sea. So they had to fall a long\n" +
                "way. So they got their tails fast in their mouths. So they couldn't get\n" +
                "them out again. That's all.'\n" +
                "\n" +
                "'Thank you,' said Alice, 'it's very interesting. I never knew so much\n" +
                "about a whiting before.'\n" +
                "\n" +
                "'I can tell you more than that, if you like,' said the Gryphon. 'Do you\n" +
                "know why it's called a whiting?'\n" +
                "\n" +
                "'I never thought about it,' said Alice. 'Why?'\n" +
                "\n" +
                "'IT DOES THE BOOTS AND SHOES.' the Gryphon replied very solemnly.\n" +
                "\n" +
                "Alice was thoroughly puzzled. 'Does the boots and shoes!' she repeated\n" +
                "in a wondering tone.\n" +
                "\n" +
                "'Why, what are YOUR shoes done with?' said the Gryphon. 'I mean, what\n" +
                "makes them so shiny?'\n" +
                "\n" +
                "Alice looked down at them, and considered a little before she gave her\n" +
                "answer. 'They're done with blacking, I believe.'\n" +
                "\n" +
                "'Boots and shoes under the sea,' the Gryphon went on in a deep voice,\n" +
                "'are done with a whiting. Now you know.'\n" +
                "\n" +
                "'And what are they made of?' Alice asked in a tone of great curiosity.\n" +
                "\n" +
                "'Soles and eels, of course,' the Gryphon replied rather impatiently:\n" +
                "'any shrimp could have told you that.'\n" +
                "\n" +
                "'If I'd been the whiting,' said Alice, whose thoughts were still running\n" +
                "on the song, 'I'd have said to the porpoise, \"Keep back, please: we\n" +
                "don't want YOU with us!\"'\n" +
                "\n" +
                "'They were obliged to have him with them,' the Mock Turtle said: 'no\n" +
                "wise fish would go anywhere without a porpoise.'\n" +
                "\n" +
                "'Wouldn't it really?' said Alice in a tone of great surprise.\n" +
                "\n" +
                "'Of course not,' said the Mock Turtle: 'why, if a fish came to ME, and\n" +
                "told me he was going a journey, I should say \"With what porpoise?\"'\n" +
                "\n" +
                "'Don't you mean \"purpose\"?' said Alice.\n" +
                "\n" +
                "'I mean what I say,' the Mock Turtle replied in an offended tone. And\n" +
                "the Gryphon added 'Come, let's hear some of YOUR adventures.'\n" +
                "\n" +
                "'I could tell you my adventures--beginning from this morning,' said\n" +
                "Alice a little timidly: 'but it's no use going back to yesterday,\n" +
                "because I was a different person then.'\n" +
                "\n" +
                "'Explain all that,' said the Mock Turtle.\n" +
                "\n" +
                "'No, no! The adventures first,' said the Gryphon in an impatient tone:\n" +
                "'explanations take such a dreadful time.'\n" +
                "\n" +
                "So Alice began telling them her adventures from the time when she first\n" +
                "saw the White Rabbit. She was a little nervous about it just at first,\n" +
                "the two creatures got so close to her, one on each side, and opened\n" +
                "their eyes and mouths so VERY wide, but she gained courage as she went\n" +
                "on. Her listeners were perfectly quiet till she got to the part about\n" +
                "her repeating 'YOU ARE OLD, FATHER WILLIAM,' to the Caterpillar, and the\n" +
                "words all coming different, and then the Mock Turtle drew a long breath,\n" +
                "and said 'That's very curious.'\n" +
                "\n" +
                "'It's all about as curious as it can be,' said the Gryphon.\n" +
                "\n" +
                "'It all came different!' the Mock Turtle repeated thoughtfully. 'I\n" +
                "should like to hear her try and repeat something now. Tell her to\n" +
                "begin.' He looked at the Gryphon as if he thought it had some kind of\n" +
                "authority over Alice.\n" +
                "\n" +
                "'Stand up and repeat \"'TIS THE VOICE OF THE SLUGGARD,\"' said the\n" +
                "Gryphon.\n" +
                "\n" +
                "'How the creatures order one about, and make one repeat lessons!'\n" +
                "thought Alice; 'I might as well be at school at once.' However, she\n" +
                "got up, and began to repeat it, but her head was so full of the Lobster\n" +
                "Quadrille, that she hardly knew what she was saying, and the words came\n" +
                "very queer indeed:--\n" +
                "\n" +
                "  ''Tis the voice of the Lobster; I heard him declare,\n" +
                "  \"You have baked me too brown, I must sugar my hair.\"\n" +
                "  As a duck with its eyelids, so he with his nose\n" +
                "  Trims his belt and his buttons, and turns out his toes.'\n" +
                "\n" +
                "       [later editions continued as follows\n" +
                "  When the sands are all dry, he is gay as a lark,\n" +
                "  And will talk in contemptuous tones of the Shark,\n" +
                "  But, when the tide rises and sharks are around,\n" +
                "  His voice has a timid and tremulous sound.]\n" +
                "\n" +
                "'That's different from what I used to say when I was a child,' said the\n" +
                "Gryphon.\n" +
                "\n" +
                "'Well, I never heard it before,' said the Mock Turtle; 'but it sounds\n" +
                "uncommon nonsense.'\n" +
                "\n" +
                "Alice said nothing; she had sat down with her face in her hands,\n" +
                "wondering if anything would EVER happen in a natural way again.\n" +
                "\n" +
                "'I should like to have it explained,' said the Mock Turtle.\n" +
                "\n" +
                "'She can't explain it,' said the Gryphon hastily. 'Go on with the next\n" +
                "verse.'\n" +
                "\n" +
                "'But about his toes?' the Mock Turtle persisted. 'How COULD he turn them\n" +
                "out with his nose, you know?'\n" +
                "\n" +
                "'It's the first position in dancing.' Alice said; but was dreadfully\n" +
                "puzzled by the whole thing, and longed to change the subject.\n" +
                "\n" +
                "'Go on with the next verse,' the Gryphon repeated impatiently: 'it\n" +
                "begins \"I passed by his garden.\"'\n" +
                "\n" +
                "Alice did not dare to disobey, though she felt sure it would all come\n" +
                "wrong, and she went on in a trembling voice:--\n" +
                "\n" +
                "  'I passed by his garden, and marked, with one eye,\n" +
                "  How the Owl and the Panther were sharing a pie--'\n" +
                "\n" +
                "    [later editions continued as follows\n" +
                "  The Panther took pie-crust, and gravy, and meat,\n" +
                "  While the Owl had the dish as its share of the treat.\n" +
                "  When the pie was all finished, the Owl, as a boon,\n" +
                "  Was kindly permitted to pocket the spoon:\n" +
                "  While the Panther received knife and fork with a growl,\n" +
                "  And concluded the banquet--]\n" +
                "\n" +
                "'What IS the use of repeating all that stuff,' the Mock Turtle\n" +
                "interrupted, 'if you don't explain it as you go on? It's by far the most\n" +
                "confusing thing I ever heard!'\n" +
                "\n" +
                "'Yes, I think you'd better leave off,' said the Gryphon: and Alice was\n" +
                "only too glad to do so.\n" +
                "\n" +
                "'Shall we try another figure of the Lobster Quadrille?' the Gryphon went\n" +
                "on. 'Or would you like the Mock Turtle to sing you a song?'\n" +
                "\n" +
                "'Oh, a song, please, if the Mock Turtle would be so kind,' Alice\n" +
                "replied, so eagerly that the Gryphon said, in a rather offended tone,\n" +
                "'Hm! No accounting for tastes! Sing her \"Turtle Soup,\" will you, old\n" +
                "fellow?'\n" +
                "\n" +
                "The Mock Turtle sighed deeply, and began, in a voice sometimes choked\n" +
                "with sobs, to sing this:--\n" +
                "\n" +
                "   'Beautiful Soup, so rich and green,\n" +
                "   Waiting in a hot tureen!\n" +
                "   Who for such dainties would not stoop?\n" +
                "   Soup of the evening, beautiful Soup!\n" +
                "   Soup of the evening, beautiful Soup!\n" +
                "     Beau--ootiful Soo--oop!\n" +
                "     Beau--ootiful Soo--oop!\n" +
                "   Soo--oop of the e--e--evening,\n" +
                "     Beautiful, beautiful Soup!\n" +
                "\n" +
                "   'Beautiful Soup! Who cares for fish,\n" +
                "   Game, or any other dish?\n" +
                "   Who would not give all else for two\n" +
                "   Pennyworth only of beautiful Soup?\n" +
                "   Pennyworth only of beautiful Soup?\n" +
                "     Beau--ootiful Soo--oop!\n" +
                "     Beau--ootiful Soo--oop!\n" +
                "   Soo--oop of the e--e--evening,\n" +
                "     Beautiful, beauti--FUL SOUP!'\n" +
                "\n" +
                "'Chorus again!' cried the Gryphon, and the Mock Turtle had just begun\n" +
                "to repeat it, when a cry of 'The trial's beginning!' was heard in the\n" +
                "distance.\n" +
                "\n" +
                "'Come on!' cried the Gryphon, and, taking Alice by the hand, it hurried\n" +
                "off, without waiting for the end of the song.\n" +
                "\n" +
                "'What trial is it?' Alice panted as she ran; but the Gryphon only\n" +
                "answered 'Come on!' and ran the faster, while more and more faintly\n" +
                "came, carried on the breeze that followed them, the melancholy words:--\n" +
                "\n" +
                "   'Soo--oop of the e--e--evening,\n" +
                "     Beautiful, beautiful Soup!'\n" +
                "\n");
        uzunString.append("CHAPTER XI. Who Stole the Tarts?\n" +
                "\n" +
                "The King and Queen of Hearts were seated on their throne when they\n" +
                "arrived, with a great crowd assembled about them--all sorts of little\n" +
                "birds and beasts, as well as the whole pack of cards: the Knave was\n" +
                "standing before them, in chains, with a soldier on each side to guard\n" +
                "him; and near the King was the White Rabbit, with a trumpet in one hand,\n" +
                "and a scroll of parchment in the other. In the very middle of the court\n" +
                "was a table, with a large dish of tarts upon it: they looked so good,\n" +
                "that it made Alice quite hungry to look at them--'I wish they'd get the\n" +
                "trial done,' she thought, 'and hand round the refreshments!' But there\n" +
                "seemed to be no chance of this, so she began looking at everything about\n" +
                "her, to pass away the time.\n" +
                "\n" +
                "Alice had never been in a court of justice before, but she had read\n" +
                "about them in books, and she was quite pleased to find that she knew\n" +
                "the name of nearly everything there. 'That's the judge,' she said to\n" +
                "herself, 'because of his great wig.'\n" +
                "\n" +
                "The judge, by the way, was the King; and as he wore his crown over the\n" +
                "wig, (look at the frontispiece if you want to see how he did it,) he did\n" +
                "not look at all comfortable, and it was certainly not becoming.\n" +
                "\n" +
                "'And that's the jury-box,' thought Alice, 'and those twelve creatures,'\n" +
                "(she was obliged to say 'creatures,' you see, because some of them were\n" +
                "animals, and some were birds,) 'I suppose they are the jurors.' She said\n" +
                "this last word two or three times over to herself, being rather proud of\n" +
                "it: for she thought, and rightly too, that very few little girls of her\n" +
                "age knew the meaning of it at all. However, 'jury-men' would have done\n" +
                "just as well.\n" +
                "\n" +
                "The twelve jurors were all writing very busily on slates. 'What are they\n" +
                "doing?' Alice whispered to the Gryphon. 'They can't have anything to put\n" +
                "down yet, before the trial's begun.'\n" +
                "\n" +
                "'They're putting down their names,' the Gryphon whispered in reply, 'for\n" +
                "fear they should forget them before the end of the trial.'\n" +
                "\n" +
                "'Stupid things!' Alice began in a loud, indignant voice, but she stopped\n" +
                "hastily, for the White Rabbit cried out, 'Silence in the court!' and the\n" +
                "King put on his spectacles and looked anxiously round, to make out who\n" +
                "was talking.\n" +
                "\n" +
                "Alice could see, as well as if she were looking over their shoulders,\n" +
                "that all the jurors were writing down 'stupid things!' on their slates,\n" +
                "and she could even make out that one of them didn't know how to spell\n" +
                "'stupid,' and that he had to ask his neighbour to tell him. 'A nice\n" +
                "muddle their slates'll be in before the trial's over!' thought Alice.\n" +
                "\n" +
                "One of the jurors had a pencil that squeaked. This of course, Alice\n" +
                "could not stand, and she went round the court and got behind him, and\n" +
                "very soon found an opportunity of taking it away. She did it so quickly\n" +
                "that the poor little juror (it was Bill, the Lizard) could not make out\n" +
                "at all what had become of it; so, after hunting all about for it, he was\n" +
                "obliged to write with one finger for the rest of the day; and this was\n" +
                "of very little use, as it left no mark on the slate.\n" +
                "\n" +
                "'Herald, read the accusation!' said the King.\n" +
                "\n" +
                "On this the White Rabbit blew three blasts on the trumpet, and then\n" +
                "unrolled the parchment scroll, and read as follows:--\n" +
                "\n" +
                "   'The Queen of Hearts, she made some tarts,\n" +
                "      All on a summer day:\n" +
                "    The Knave of Hearts, he stole those tarts,\n" +
                "      And took them quite away!'\n" +
                "\n" +
                "'Consider your verdict,' the King said to the jury.\n" +
                "\n" +
                "'Not yet, not yet!' the Rabbit hastily interrupted. 'There's a great\n" +
                "deal to come before that!'\n" +
                "\n" +
                "'Call the first witness,' said the King; and the White Rabbit blew three\n" +
                "blasts on the trumpet, and called out, 'First witness!'\n" +
                "\n" +
                "The first witness was the Hatter. He came in with a teacup in one\n" +
                "hand and a piece of bread-and-butter in the other. 'I beg pardon, your\n" +
                "Majesty,' he began, 'for bringing these in: but I hadn't quite finished\n" +
                "my tea when I was sent for.'\n" +
                "\n" +
                "'You ought to have finished,' said the King. 'When did you begin?'\n" +
                "\n" +
                "The Hatter looked at the March Hare, who had followed him into the\n" +
                "court, arm-in-arm with the Dormouse. 'Fourteenth of March, I think it\n" +
                "was,' he said.\n" +
                "\n" +
                "'Fifteenth,' said the March Hare.\n" +
                "\n" +
                "'Sixteenth,' added the Dormouse.\n" +
                "\n" +
                "'Write that down,' the King said to the jury, and the jury eagerly\n" +
                "wrote down all three dates on their slates, and then added them up, and\n" +
                "reduced the answer to shillings and pence.\n" +
                "\n" +
                "'Take off your hat,' the King said to the Hatter.\n" +
                "\n" +
                "'It isn't mine,' said the Hatter.\n" +
                "\n" +
                "'Stolen!' the King exclaimed, turning to the jury, who instantly made a\n" +
                "memorandum of the fact.\n" +
                "\n" +
                "'I keep them to sell,' the Hatter added as an explanation; 'I've none of\n" +
                "my own. I'm a hatter.'\n" +
                "\n" +
                "Here the Queen put on her spectacles, and began staring at the Hatter,\n" +
                "who turned pale and fidgeted.\n" +
                "\n" +
                "'Give your evidence,' said the King; 'and don't be nervous, or I'll have\n" +
                "you executed on the spot.'\n" +
                "\n" +
                "This did not seem to encourage the witness at all: he kept shifting\n" +
                "from one foot to the other, looking uneasily at the Queen, and in\n" +
                "his confusion he bit a large piece out of his teacup instead of the\n" +
                "bread-and-butter.\n" +
                "\n" +
                "Just at this moment Alice felt a very curious sensation, which puzzled\n" +
                "her a good deal until she made out what it was: she was beginning to\n" +
                "grow larger again, and she thought at first she would get up and leave\n" +
                "the court; but on second thoughts she decided to remain where she was as\n" +
                "long as there was room for her.\n" +
                "\n" +
                "'I wish you wouldn't squeeze so.' said the Dormouse, who was sitting\n" +
                "next to her. 'I can hardly breathe.'\n" +
                "\n" +
                "'I can't help it,' said Alice very meekly: 'I'm growing.'\n" +
                "\n" +
                "'You've no right to grow here,' said the Dormouse.\n" +
                "\n" +
                "'Don't talk nonsense,' said Alice more boldly: 'you know you're growing\n" +
                "too.'\n" +
                "\n" +
                "'Yes, but I grow at a reasonable pace,' said the Dormouse: 'not in that\n" +
                "ridiculous fashion.' And he got up very sulkily and crossed over to the\n" +
                "other side of the court.\n" +
                "\n" +
                "All this time the Queen had never left off staring at the Hatter, and,\n" +
                "just as the Dormouse crossed the court, she said to one of the officers\n" +
                "of the court, 'Bring me the list of the singers in the last concert!' on\n" +
                "which the wretched Hatter trembled so, that he shook both his shoes off.\n" +
                "\n" +
                "'Give your evidence,' the King repeated angrily, 'or I'll have you\n" +
                "executed, whether you're nervous or not.'\n" +
                "\n" +
                "'I'm a poor man, your Majesty,' the Hatter began, in a trembling voice,\n" +
                "'--and I hadn't begun my tea--not above a week or so--and what with the\n" +
                "bread-and-butter getting so thin--and the twinkling of the tea--'\n" +
                "\n" +
                "'The twinkling of the what?' said the King.\n" +
                "\n" +
                "'It began with the tea,' the Hatter replied.\n" +
                "\n" +
                "'Of course twinkling begins with a T!' said the King sharply. 'Do you\n" +
                "take me for a dunce? Go on!'\n" +
                "\n" +
                "'I'm a poor man,' the Hatter went on, 'and most things twinkled after\n" +
                "that--only the March Hare said--'\n" +
                "\n" +
                "'I didn't!' the March Hare interrupted in a great hurry.\n" +
                "\n" +
                "'You did!' said the Hatter.\n" +
                "\n" +
                "'I deny it!' said the March Hare.\n" +
                "\n" +
                "'He denies it,' said the King: 'leave out that part.'\n" +
                "\n" +
                "'Well, at any rate, the Dormouse said--' the Hatter went on, looking\n" +
                "anxiously round to see if he would deny it too: but the Dormouse denied\n" +
                "nothing, being fast asleep.\n" +
                "\n" +
                "'After that,' continued the Hatter, 'I cut some more bread-and-butter--'\n" +
                "\n" +
                "'But what did the Dormouse say?' one of the jury asked.\n" +
                "\n" +
                "'That I can't remember,' said the Hatter.\n" +
                "\n" +
                "'You MUST remember,' remarked the King, 'or I'll have you executed.'\n" +
                "\n" +
                "The miserable Hatter dropped his teacup and bread-and-butter, and went\n" +
                "down on one knee. 'I'm a poor man, your Majesty,' he began.\n" +
                "\n" +
                "'You're a very poor speaker,' said the King.\n" +
                "\n" +
                "Here one of the guinea-pigs cheered, and was immediately suppressed by\n" +
                "the officers of the court. (As that is rather a hard word, I will just\n" +
                "explain to you how it was done. They had a large canvas bag, which tied\n" +
                "up at the mouth with strings: into this they slipped the guinea-pig,\n" +
                "head first, and then sat upon it.)\n" +
                "\n" +
                "'I'm glad I've seen that done,' thought Alice. 'I've so often read\n" +
                "in the newspapers, at the end of trials, \"There was some attempts\n" +
                "at applause, which was immediately suppressed by the officers of the\n" +
                "court,\" and I never understood what it meant till now.'\n" +
                "\n" +
                "'If that's all you know about it, you may stand down,' continued the\n" +
                "King.\n" +
                "\n" +
                "'I can't go no lower,' said the Hatter: 'I'm on the floor, as it is.'\n" +
                "\n" +
                "'Then you may SIT down,' the King replied.\n" +
                "\n" +
                "Here the other guinea-pig cheered, and was suppressed.\n" +
                "\n" +
                "'Come, that finished the guinea-pigs!' thought Alice. 'Now we shall get\n" +
                "on better.'\n" +
                "\n" +
                "'I'd rather finish my tea,' said the Hatter, with an anxious look at the\n" +
                "Queen, who was reading the list of singers.\n" +
                "\n" +
                "'You may go,' said the King, and the Hatter hurriedly left the court,\n" +
                "without even waiting to put his shoes on.\n" +
                "\n" +
                "'--and just take his head off outside,' the Queen added to one of the\n" +
                "officers: but the Hatter was out of sight before the officer could get\n" +
                "to the door.\n" +
                "\n" +
                "'Call the next witness!' said the King.\n" +
                "\n" +
                "The next witness was the Duchess's cook. She carried the pepper-box in\n" +
                "her hand, and Alice guessed who it was, even before she got into the\n" +
                "court, by the way the people near the door began sneezing all at once.\n" +
                "\n" +
                "'Give your evidence,' said the King.\n" +
                "\n" +
                "'Shan't,' said the cook.\n" +
                "\n" +
                "The King looked anxiously at the White Rabbit, who said in a low voice,\n" +
                "'Your Majesty must cross-examine THIS witness.'\n" +
                "\n" +
                "'Well, if I must, I must,' the King said, with a melancholy air, and,\n" +
                "after folding his arms and frowning at the cook till his eyes were\n" +
                "nearly out of sight, he said in a deep voice, 'What are tarts made of?'\n" +
                "\n" +
                "'Pepper, mostly,' said the cook.\n" +
                "\n" +
                "'Treacle,' said a sleepy voice behind her.\n" +
                "\n" +
                "'Collar that Dormouse,' the Queen shrieked out. 'Behead that Dormouse!\n" +
                "Turn that Dormouse out of court! Suppress him! Pinch him! Off with his\n" +
                "whiskers!'\n" +
                "\n" +
                "For some minutes the whole court was in confusion, getting the Dormouse\n" +
                "turned out, and, by the time they had settled down again, the cook had\n" +
                "disappeared.\n" +
                "\n" +
                "'Never mind!' said the King, with an air of great relief. 'Call the next\n" +
                "witness.' And he added in an undertone to the Queen, 'Really, my dear,\n" +
                "YOU must cross-examine the next witness. It quite makes my forehead\n" +
                "ache!'\n" +
                "\n" +
                "Alice watched the White Rabbit as he fumbled over the list, feeling very\n" +
                "curious to see what the next witness would be like, '--for they haven't\n" +
                "got much evidence YET,' she said to herself. Imagine her surprise, when\n" +
                "the White Rabbit read out, at the top of his shrill little voice, the\n" +
                "name 'Alice!'\n" +
                "\n");
        uzunString.append("    CHAPTER XII\n" +
                "\n" +
                "           Alice's Evidence\n" +
                "\n" +
                "\n" +
                "'Here!' cried Alice, quite forgetting in the flurry of the moment how\n" +
                "large she had grown in the last few minutes, and she jumped up in such\n" +
                "a hurry that she tipped over the jury-box with the edge of her skirt,\n" +
                "upsetting all the jurymen on to the heads of the crowd below, and there\n" +
                "they lay sprawling about, reminding her very much of a globe of goldfish\n" +
                "she had accidentally upset the week before.\n" +
                "\n" +
                "'Oh, I BEG your pardon!' she exclaimed in a tone of great dismay, and\n" +
                "began picking them up again as quickly as she could, for the accident of\n" +
                "the goldfish kept running in her head, and she had a vague sort of idea\n" +
                "that they must be collected at once and put back into the jury-box, or\n" +
                "they would die.\n" +
                "\n" +
                "'The trial cannot proceed,' said the King in a very grave voice, 'until\n" +
                "all the jurymen are back in their proper places--ALL,' he repeated with\n" +
                "great emphasis, looking hard at Alice as he said do.\n" +
                "\n" +
                "Alice looked at the jury-box, and saw that, in her haste, she had put\n" +
                "the Lizard in head downwards, and the poor little thing was waving its\n" +
                "tail about in a melancholy way, being quite unable to move. She soon got\n" +
                "it out again, and put it right; 'not that it signifies much,' she said\n" +
                "to herself; 'I should think it would be QUITE as much use in the trial\n" +
                "one way up as the other.'\n" +
                "\n" +
                "As soon as the jury had a little recovered from the shock of being\n" +
                "upset, and their slates and pencils had been found and handed back to\n" +
                "them, they set to work very diligently to write out a history of the\n" +
                "accident, all except the Lizard, who seemed too much overcome to do\n" +
                "anything but sit with its mouth open, gazing up into the roof of the\n" +
                "court.\n" +
                "\n" +
                "'What do you know about this business?' the King said to Alice.\n" +
                "\n" +
                "'Nothing,' said Alice.\n" +
                "\n" +
                "'Nothing WHATEVER?' persisted the King.\n" +
                "\n" +
                "'Nothing whatever,' said Alice.\n" +
                "\n" +
                "'That's very important,' the King said, turning to the jury. They were\n" +
                "just beginning to write this down on their slates, when the White Rabbit\n" +
                "interrupted: 'UNimportant, your Majesty means, of course,' he said in a\n" +
                "very respectful tone, but frowning and making faces at him as he spoke.\n" +
                "\n" +
                "'UNimportant, of course, I meant,' the King hastily said, and went on\n" +
                "to himself in an undertone,\n" +
                "\n" +
                "'important--unimportant--unimportant--important--' as if he were trying\n" +
                "which word sounded best.\n" +
                "\n" +
                "Some of the jury wrote it down 'important,' and some 'unimportant.'\n" +
                "Alice could see this, as she was near enough to look over their slates;\n" +
                "'but it doesn't matter a bit,' she thought to herself.\n" +
                "\n" +
                "At this moment the King, who had been for some time busily writing in\n" +
                "his note-book, cackled out 'Silence!' and read out from his book, 'Rule\n" +
                "Forty-two. ALL PERSONS MORE THAN A MILE HIGH TO LEAVE THE COURT.'\n" +
                "\n" +
                "Everybody looked at Alice.\n" +
                "\n" +
                "'I'M not a mile high,' said Alice.\n" +
                "\n" +
                "'You are,' said the King.\n" +
                "\n" +
                "'Nearly two miles high,' added the Queen.\n" +
                "\n" +
                "'Well, I shan't go, at any rate,' said Alice: 'besides, that's not a\n" +
                "regular rule: you invented it just now.'\n" +
                "\n" +
                "'It's the oldest rule in the book,' said the King.\n" +
                "\n" +
                "'Then it ought to be Number One,' said Alice.\n" +
                "\n" +
                "The King turned pale, and shut his note-book hastily. 'Consider your\n" +
                "verdict,' he said to the jury, in a low, trembling voice.\n" +
                "\n" +
                "'There's more evidence to come yet, please your Majesty,' said the White\n" +
                "Rabbit, jumping up in a great hurry; 'this paper has just been picked\n" +
                "up.'\n" +
                "\n" +
                "'What's in it?' said the Queen.\n" +
                "\n" +
                "'I haven't opened it yet,' said the White Rabbit, 'but it seems to be a\n" +
                "letter, written by the prisoner to--to somebody.'\n" +
                "\n" +
                "'It must have been that,' said the King, 'unless it was written to\n" +
                "nobody, which isn't usual, you know.'\n" +
                "\n" +
                "'Who is it directed to?' said one of the jurymen.\n" +
                "\n" +
                "'It isn't directed at all,' said the White Rabbit; 'in fact, there's\n" +
                "nothing written on the OUTSIDE.' He unfolded the paper as he spoke, and\n" +
                "added 'It isn't a letter, after all: it's a set of verses.'\n" +
                "\n" +
                "'Are they in the prisoner's handwriting?' asked another of the jurymen.\n" +
                "\n" +
                "'No, they're not,' said the White Rabbit, 'and that's the queerest thing\n" +
                "about it.' (The jury all looked puzzled.)\n" +
                "\n" +
                "'He must have imitated somebody else's hand,' said the King. (The jury\n" +
                "all brightened up again.)\n" +
                "\n" +
                "'Please your Majesty,' said the Knave, 'I didn't write it, and they\n" +
                "can't prove I did: there's no name signed at the end.'\n" +
                "\n" +
                "'If you didn't sign it,' said the King, 'that only makes the matter\n" +
                "worse. You MUST have meant some mischief, or else you'd have signed your\n" +
                "name like an honest man.'\n" +
                "\n" +
                "There was a general clapping of hands at this: it was the first really\n" +
                "clever thing the King had said that day.\n" +
                "\n" +
                "'That PROVES his guilt,' said the Queen.\n" +
                "\n" +
                "'It proves nothing of the sort!' said Alice. 'Why, you don't even know\n" +
                "what they're about!'\n" +
                "\n" +
                "'Read them,' said the King.\n" +
                "\n" +
                "The White Rabbit put on his spectacles. 'Where shall I begin, please\n" +
                "your Majesty?' he asked.\n" +
                "\n" +
                "'Begin at the beginning,' the King said gravely, 'and go on till you\n" +
                "come to the end: then stop.'\n" +
                "\n" +
                "These were the verses the White Rabbit read:--\n" +
                "\n" +
                "   'They told me you had been to her,\n" +
                "    And mentioned me to him:\n" +
                "   She gave me a good character,\n" +
                "    But said I could not swim.\n" +
                "\n" +
                "   He sent them word I had not gone\n" +
                "    (We know it to be true):\n" +
                "   If she should push the matter on,\n" +
                "    What would become of you?\n" +
                "\n" +
                "   I gave her one, they gave him two,\n" +
                "    You gave us three or more;\n" +
                "   They all returned from him to you,\n" +
                "    Though they were mine before.\n" +
                "\n" +
                "   If I or she should chance to be\n" +
                "    Involved in this affair,\n" +
                "   He trusts to you to set them free,\n" +
                "    Exactly as we were.\n" +
                "\n" +
                "   My notion was that you had been\n" +
                "    (Before she had this fit)\n" +
                "   An obstacle that came between\n" +
                "    Him, and ourselves, and it.\n" +
                "\n" +
                "   Don't let him know she liked them best,\n" +
                "    For this must ever be\n" +
                "   A secret, kept from all the rest,\n" +
                "    Between yourself and me.'\n" +
                "\n" +
                "'That's the most important piece of evidence we've heard yet,' said the\n" +
                "King, rubbing his hands; 'so now let the jury--'\n" +
                "\n" +
                "'If any one of them can explain it,' said Alice, (she had grown so large\n" +
                "in the last few minutes that she wasn't a bit afraid of interrupting\n" +
                "him,) 'I'll give him sixpence. _I_ don't believe there's an atom of\n" +
                "meaning in it.'\n" +
                "\n" +
                "The jury all wrote down on their slates, 'SHE doesn't believe there's an\n" +
                "atom of meaning in it,' but none of them attempted to explain the paper.\n" +
                "\n" +
                "'If there's no meaning in it,' said the King, 'that saves a world of\n" +
                "trouble, you know, as we needn't try to find any. And yet I don't know,'\n" +
                "he went on, spreading out the verses on his knee, and looking at them\n" +
                "with one eye; 'I seem to see some meaning in them, after all. \"--SAID\n" +
                "I COULD NOT SWIM--\" you can't swim, can you?' he added, turning to the\n" +
                "Knave.\n" +
                "\n" +
                "The Knave shook his head sadly. 'Do I look like it?' he said. (Which he\n" +
                "certainly did NOT, being made entirely of cardboard.)\n" +
                "\n" +
                "'All right, so far,' said the King, and he went on muttering over\n" +
                "the verses to himself: '\"WE KNOW IT TO BE TRUE--\" that's the jury, of\n" +
                "course--\"I GAVE HER ONE, THEY GAVE HIM TWO--\" why, that must be what he\n" +
                "did with the tarts, you know--'\n" +
                "\n" +
                "'But, it goes on \"THEY ALL RETURNED FROM HIM TO YOU,\"' said Alice.\n" +
                "\n" +
                "'Why, there they are!' said the King triumphantly, pointing to the tarts\n" +
                "on the table. 'Nothing can be clearer than THAT. Then again--\"BEFORE SHE\n" +
                "HAD THIS FIT--\" you never had fits, my dear, I think?' he said to the\n" +
                "Queen.\n" +
                "\n" +
                "'Never!' said the Queen furiously, throwing an inkstand at the Lizard\n" +
                "as she spoke. (The unfortunate little Bill had left off writing on his\n" +
                "slate with one finger, as he found it made no mark; but he now hastily\n" +
                "began again, using the ink, that was trickling down his face, as long as\n" +
                "it lasted.)\n" +
                "\n" +
                "'Then the words don't FIT you,' said the King, looking round the court\n" +
                "with a smile. There was a dead silence.\n" +
                "\n" +
                "'It's a pun!' the King added in an offended tone, and everybody laughed,\n" +
                "'Let the jury consider their verdict,' the King said, for about the\n" +
                "twentieth time that day.\n" +
                "\n" +
                "'No, no!' said the Queen. 'Sentence first--verdict afterwards.'\n" +
                "\n" +
                "'Stuff and nonsense!' said Alice loudly. 'The idea of having the\n" +
                "sentence first!'\n" +
                "\n" +
                "'Hold your tongue!' said the Queen, turning purple.\n" +
                "\n" +
                "'I won't!' said Alice.\n" +
                "\n" +
                "'Off with her head!' the Queen shouted at the top of her voice. Nobody\n" +
                "moved.\n" +
                "\n" +
                "'Who cares for you?' said Alice, (she had grown to her full size by this\n" +
                "time.) 'You're nothing but a pack of cards!'\n" +
                "\n" +
                "At this the whole pack rose up into the air, and came flying down upon\n" +
                "her: she gave a little scream, half of fright and half of anger, and\n" +
                "tried to beat them off, and found herself lying on the bank, with her\n" +
                "head in the lap of her sister, who was gently brushing away some dead\n" +
                "leaves that had fluttered down from the trees upon her face.\n" +
                "\n" +
                "'Wake up, Alice dear!' said her sister; 'Why, what a long sleep you've\n" +
                "had!'\n" +
                "\n" +
                "'Oh, I've had such a curious dream!' said Alice, and she told her\n" +
                "sister, as well as she could remember them, all these strange Adventures\n" +
                "of hers that you have just been reading about; and when she had\n" +
                "finished, her sister kissed her, and said, 'It WAS a curious dream,\n" +
                "dear, certainly: but now run in to your tea; it's getting late.' So\n" +
                "Alice got up and ran off, thinking while she ran, as well she might,\n" +
                "what a wonderful dream it had been.\n" +
                "\n" +
                "But her sister sat still just as she left her, leaning her head on her\n" +
                "hand, watching the setting sun, and thinking of little Alice and all her\n" +
                "wonderful Adventures, till she too began dreaming after a fashion, and\n" +
                "this was her dream:--\n" +
                "\n" +
                "First, she dreamed of little Alice herself, and once again the tiny\n" +
                "hands were clasped upon her knee, and the bright eager eyes were looking\n" +
                "up into hers--she could hear the very tones of her voice, and see that\n" +
                "queer little toss of her head to keep back the wandering hair that\n" +
                "WOULD always get into her eyes--and still as she listened, or seemed to\n" +
                "listen, the whole place around her became alive the strange creatures of\n" +
                "her little sister's dream.\n" +
                "\n" +
                "The long grass rustled at her feet as the White Rabbit hurried by--the\n" +
                "frightened Mouse splashed his way through the neighbouring pool--she\n" +
                "could hear the rattle of the teacups as the March Hare and his friends\n" +
                "shared their never-ending meal, and the shrill voice of the Queen\n" +
                "ordering off her unfortunate guests to execution--once more the pig-baby\n" +
                "was sneezing on the Duchess's knee, while plates and dishes crashed\n" +
                "around it--once more the shriek of the Gryphon, the squeaking of the\n" +
                "Lizard's slate-pencil, and the choking of the suppressed guinea-pigs,\n" +
                "filled the air, mixed up with the distant sobs of the miserable Mock\n" +
                "Turtle.\n" +
                "\n" +
                "So she sat on, with closed eyes, and half believed herself in\n" +
                "Wonderland, though she knew she had but to open them again, and all\n" +
                "would change to dull reality--the grass would be only rustling in the\n" +
                "wind, and the pool rippling to the waving of the reeds--the rattling\n" +
                "teacups would change to tinkling sheep-bells, and the Queen's shrill\n" +
                "cries to the voice of the shepherd boy--and the sneeze of the baby, the\n" +
                "shriek of the Gryphon, and all the other queer noises, would change (she\n" +
                "knew) to the confused clamour of the busy farm-yard--while the lowing\n" +
                "of the cattle in the distance would take the place of the Mock Turtle's\n" +
                "heavy sobs.\n" +
                "\n" +
                "Lastly, she pictured to herself how this same little sister of hers\n" +
                "would, in the after-time, be herself a grown woman; and how she would\n" +
                "keep, through all her riper years, the simple and loving heart of her\n" +
                "childhood: and how she would gather about her other little children, and\n" +
                "make THEIR eyes bright and eager with many a strange tale, perhaps even\n" +
                "with the dream of Wonderland of long ago: and how she would feel with\n" +
                "all their simple sorrows, and find a pleasure in all their simple joys,\n" +
                "remembering her own child-life, and the happy summer days.\n" +
                "\n" +
                "              THE END\n" +
                "\n");







        String upon = "upon";
        String sigh = "sigh";
        String Dormouse = "Dormouse";
        String jurybox = "jury-box";
        String swim = "swim";

        ss.search(uzunString.toString().toCharArray(), upon.toCharArray());
        ss.search(uzunString.toString().toCharArray(), sigh.toCharArray());
        ss.search(uzunString.toString().toCharArray(), Dormouse.toCharArray());
        ss.search(uzunString.toString().toCharArray(), jurybox.toCharArray());
        ss.search(uzunString.toString().toCharArray(), swim.toCharArray());


    }

}

