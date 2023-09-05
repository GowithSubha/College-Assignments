// 1) Write a Menu driven C program to accomplish the following functionalities in single linked list.
//     a) Create a single linked list.
//     b) Display the elements of a single linked list.
//     c) Insert a node at the beginning of a single linked list.
//     d) Insert a node at the end of a single linked list.
//     e) Insert a node before a given node of a single linked list.
//     f) Insert a node after a given node of a single linked list.
//     g) Delete a node from the beginning of a single linked list.
//     h) Delete a node from the end of a single linked list.
//     i) Delete a node after a given node of a single linked list.
//     j) Delete the entire single linked list.

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head = NULL;
struct node *tail = NULL;
void create()
{
    int n;
    printf("Enter the number of nodes you want to create: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        struct node *newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter the data of node %d: ", i + 1);
        scanf("%d", &newnode->data);
        newnode->next = NULL;
        if (head == NULL)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail->next = newnode;
            tail = newnode;
        }
    }
}
void display()
{
    struct node *temp = head;
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        printf("The elements of the list are: ");
        while (temp != NULL)
        {
            printf("%d ", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}
void insert_at_beginning()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    newnode->next = head;
    head = newnode;
}
void insert_at_end()
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    newnode->next = NULL;
    tail->next = newnode;
    tail = newnode;
}
void insert_before_given_node()
{
    int key;
    printf("Enter the data of the node before which you want to insert the newnode: ");
    scanf("%d", &key);
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    struct node *temp = head;
    while (temp->next->data != key)
    {
        temp = temp->next;
    }
    newnode->next = temp->next;
    temp->next = newnode;
}
void insert_after_given_node()
{
    int key;
    printf("Enter the data of the node after which you want to insert the newnode: ");
    scanf("%d", &key);
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the data of the newnode: ");
    scanf("%d", &newnode->data);
    struct node *temp = head;
    while (temp->data != key)
    {
        temp = temp->next;
    }
    newnode->next = temp->next;
    temp->next = newnode;
}
void delete_from_beginning()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        head = head->next;
        free(temp);
    }
}
void delete_from_end()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        while (temp->next != tail)
        {
            temp = temp->next;
        }
        temp->next = NULL;
        free(tail);
        tail = temp;
    }
}
void delete_after_node()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        int key;
        printf("Enter the data of the node after which you want to delete the node: ");
        scanf("%d", &key);
        struct node *temp = head;
        while (temp->data != key)
        {
            temp = temp->next;
        }
        struct node *temp1 = temp->next;
        temp->next = temp1->next;
        free(temp1);
    }
}
void delete_entire_list()
{
    if (head == NULL)
    {
        printf("The list is empty\n");
    }
    else
    {
        struct node *temp = head;
        while (temp != NULL)
        {
            head = head->next;
            free(temp);
            temp = head;
        }
    }
}
int main()
{
    int choice;
    while (1)
    {
        printf("Enter 1 to create a single linked list\n");
        printf("Enter 2 to display the elements of a single linked list\n");
        printf("Enter 3 to insert a node at the beginning of a single linked list\n");
        printf("Enter 4 to insert a node at the end of a single linked list\n");
        printf("Enter 5 to insert a node before a given node of a single linked list\n");
        printf("Enter 6 to insert a node after a given node of a single linked list\n");
        printf("Enter 7 to delete a node from the beginning of a single linked list\n");
        printf("Enter 8 to delete a node from the end of a single linked list\n");
        printf("Enter 9 to delete a node after a given node of a single linked list\n");
        printf("Enter 10 to delete the entire single linked list\n");
        printf("Enter 11 to exit\n");
        printf("Enter your choice: ");
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
            insert_at_beginning();
            break;
        case 4:
            insert_at_end();
            break;
        case 5:
            insert_before_given_node();
            break;
        case 6:
            insert_after_given_node();
            break;
        case 7:
            delete_from_beginning();
            break;
        case 8:
            delete_from_end();
            break;
        case 9:
            delete_after_node();
            break;
        case 10:
            delete_entire_list();
            break;
        case 11:
            exit(0);
        default:
            printf("Invalid choice\n");
        }
    }
}
