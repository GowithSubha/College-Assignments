// 2) Write a Menu driven C program to accomplish the following functionalities in circular linked list.
//     a) Create a circular linked list.
//     b) Display the elements of a circular linked list.
//     c) Insert a node at the beginning of a circular linked list.
//     d) Insert a node at the end of a circular linked list.
//     e) Delete a node from the beginning of a circular linked list.
//     f) Delete a node from the end of a circular linked list.
//     g) Delete a node after a given node of a circular linked list.
//     h) Delete the entire circular linked list.

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL;
void create()
{
    struct node *newnode, *temp;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    if (head == NULL)
    {
        head = newnode;
        temp = newnode;
    }
    else
    {
        temp->next = newnode;
        temp = newnode;
    }
}
void display()
{
    struct node *temp;
    temp = head;
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        while (temp != NULL)
        {
            printf("The Value of linked list: \t%d \n", temp->data);
            temp = temp->next;
        }
    }
}
void insert_begin()
{
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = head;
    head = newnode;
}
void insert_end()
{
    struct node *newnode, *temp;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data\n");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newnode;
}
void delete_begin()
{
    struct node *temp;
    temp = head;
    head = head->next;
    free(temp);
}
void delete_end()
{
    struct node *temp, *prevnode;
    temp = head;
    while (temp->next != NULL)
    {
        prevnode = temp;
        temp = temp->next;
    }
    prevnode->next = NULL;
    free(temp);
}
void delete_after()
{
    struct node *temp, *nextnode;
    int pos, i = 1;
    printf("Enter the position after which the node is to be deleted\n");
    scanf("%d", &pos);
    temp = head;
    while (i < pos)
    {
        temp = temp->next;
        i++;
    }
    nextnode = temp->next;
    temp->next = nextnode->next;
    free(nextnode);
}
void delete_list()
{
    struct node *temp;
    temp = head;
    while (temp != NULL)
    {
        head = head->next;
        free(temp);
        temp = head;
    }
}
int main(int argc, char const *argv[])
{
    int choice;
    while (1)
    {
        
        printf("Enter 1 to create a node\n");
        printf("Enter 2 to display the list\n");
        printf("Enter 3 to insert a node at the beginning\n");
        printf("Enter 4 to insert a node at the end\n");
        printf("Enter 5 to delete a node from the beginning\n");
        printf("Enter 6 to delete a node from the end\n");
        printf("Enter 7 to delete a node after a given node\n");
        printf("Enter 8 to delete the entire list\n");
        printf("Enter 9 to exit\n");
        printf("Enter your choice\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            insert_begin();
            break;
        case 4:
            insert_end();
            break;
        case 5:
            delete_begin();
            break;
        case 6:
            delete_end();
            break;
        case 7:
            delete_after();
            break;
        case 8:
            delete_list();
            break;
        case 9:
            exit(0);
            break;
        default:
            printf("Invalid choice\n");
            break;
        }
    }
    return 0;
}
