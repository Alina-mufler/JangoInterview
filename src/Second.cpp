#include <iostream>
#include <set>

using namespace std;

int main()
{
    cout<<"Hello, my name is Alina, with this program you will learn a little new about me"<<endl;
    cout<<"To find out more, enter the number of any team suggested below:"<<endl;
    cout<<" Enter 1, to find out my favorite color."<<endl;
    cout<<" Enter 2, to find out which cola I prefer to drink."<<endl;
    cout<<" Enter 3, to find out what kind of sport I like."<<endl;
    cout<<" Enter 4, to find out if I believe in unicorns."<<endl;
    cout<<" Enter 0, if you found out everything you wanted to know about me."<<endl;
    char command;
    cin>>command;
    set<char> check;
    check.insert(command);
    while(command!='0'){
        switch(command){
            case '1':
                cout<<" My favorite coloe is red."<<endl;
                break;
            case '2':
                cout<<" I prefer to drink regular cola."<<endl;
                break;
            case '3':
                cout<<" I like basketball."<<endl;
                break;
            case '4':
                cout<<" I believe in unicorns, why not."<<endl;
                break;
            default:
                cout<<" I'm sorry, but there is no such team."<<endl;
                break;
        }
        if (check.size() == 4){
            cout<<" You've got all the information you can about me."<<endl;
            break;
        }
        cin>>command;
        if (command == '1' || command == '2' || command == '3' || command == '4'){
            check.insert(command);
        }

    }
    return 0;
}
