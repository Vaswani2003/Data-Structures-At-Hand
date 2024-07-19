class Node:
    def __init__(self) -> None:
        self.data = None
        self.left = None
        self.right = None

class BST:
    def __call__(self):
        self.root = None

    def insert(self, root, val):

        if self.root is None:
            self.root = Node(val)

        elif root is None:
            root = Node(val)

        elif (val < root.data):
            self.insert(root.left, val)

        else:
            self.insert(root.right, val)

    def inorder(self, root):

        if root is None:
            return None
        
        self.inorder(root.left)

        print(root.data)

        self.inorder(root.right)
        
if __name__ == '__init__':
    Bst = BST()

    nums = [14,10,8,64,9]
    
    for num in nums:
        Bst.insert(Bst.root, num)

    Bst.inorder(Bst.root)
