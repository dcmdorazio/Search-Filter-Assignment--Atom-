/*Author: Cody D'Orazio
    Assignment: Search filter project
    Date last edited: 5/4/19
    */

// Sport Variables for HTML format
var sport = [
    'Lacrosse',
    'Soccer',
    'Swimming',
    'Polo',
    'Baseball',
    'Football',
    'Cycling',
    'Fishing',
    'Hunting',
    'Golf',
    'Gymnastics',
    'Wrestling',
    'Cross_Country',
    'Hockey',
    'Weightlifting',
    'Motor_Sports',
    'Skating',
    ];

ul = document.getElementById("sport-list");

var render_lists = function (lists) {
    var li = "";
    for(index in lists) {
        li += "<li>" + lists[index] + "</li>";
    }
    ul.innerHTML = li;
}
render_lists(sport);


input = document.getElementById('filter_sport');

var filter_sport = function (event) {
    keyword = input.value.toLowerCase();
    sport.filter(function(sport){
        sport=sport.toLowerCase();

        return;
        sport.indexOf(keyword) > -1;
    });
    render_lists(filter_sport());
}
input.addEventListener('keyup',filter_sport);
