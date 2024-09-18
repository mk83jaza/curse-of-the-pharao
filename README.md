# The Curse of the Pharaoh

Part of J.B. Rainsberger's [World's Best Intro to TDD](https://online-training.jbrains.ca/p/wbitdd-01) is an exercise of
building an MVC-App with Client-First-Design (London-School/Outside-In). I remembered an old OO programming task from
university and reimplemented it.  
The rules are the following: The royal triangle stretches between three pyramids. Inside of it is a hidden treasure. A
treasure hunter sets out to find it. But he has not reckoned with the Pharaoh's curse. This means that he can only ever
move in a straight line towards one of the three pyramids within the royal triangle and only ever manages half the
distance before he has to rest. Then he sets off for a new destination.

## Possible Improvements

- The model could notify the view to display a new digging point directly.
- The triangle could calculate a ``Dimension``, which then could be used to set the frame or panel size automatically.
