# FanTrade
This is my semester long project for cis3296 Software Design.

# Abstract
FanTrade is a fantasy football trade analysis app designed to evaluate trades based on both individual player performance and the effect that a trade would have on a user’s full fantasy football roster. Many fantasy football trade apps provide player value or trade comparisons, but most do not take into account the full roster. FanTrade differs by taking into consideration the full fantasy roster, using updated weekly to include up to date statistics and player positions. My idea is to have a better trade calculator than just individual players. When trades may seem good because of the players involved, it could potentially make your team worse by losing depth in positions that you need. The intended users are fantasy football players who want better insights on the trades that they are proposing or considering. This project is valuable because it will give fantasy football players all the stats and information that they need to evaluate whether a trade is good or not.

# Background
When I play fantasy football, I specifically use websites like flock fantasy (Flock Fantasy) to evaluate if I am making or accepting a good trade. While this website is useful for the players being traded, I am always skeptical of the trade as it is trading players without taking my full roster into consideration. If I am trading two running backs for a wide receiver, I might be winning the trade through a better player, but I now have no running backs to put into those positions. My app is designed to analyze my full roster to see if I can lose those players with the current depth I have. If I trade those players and I have no running back depth, it was in reality a potentially horrible trade for me. My plan for this project is to firstly create the formula / calculations for the trade itself, using flock fantasy as inspiration. Then I will need to code in taking consideration for the entire team. After that, I will then need to create a new formula using the roster and the players being traded. After this is complete, I will then need to have the NFL players’ status updated weekly every Tuesday (which is the start of the new NFL week) to reflect accurate trading statistics. These stats will also include injuries, suspensions, bye weeks, and any other relevant data. Once all of these are implemented, I will have the most accurate version of my app that I can have. Later down the road, if possible, I could update these stats more frequently.
FanTrade will be developed from the ground up, using no existing code from open-source fantasy football trade calculators. I will be using existing applications such as Flock Fantasy as inspiration to understand how the calculator should be designed and what features I need to include.

# Proof of Concept 
https://github.com/ledmundson76/FanTrade

# Required Resources
There should be no extra resources needed. My plan is to have this be able to run on your laptop hosted on GitHub and can be created and run on VS Code. I will most likely be using Java and will need a database to hold the NFL players’ statistics. 


