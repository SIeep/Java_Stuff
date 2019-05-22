<template>
    <div class="test">
        <h1>This is a test page</h1>
        <h1>Text</h1>
        <h1>Message: {{message}}</h1>
        <h1>Name: {{myName}}</h1>

        <form action="/sign-in" method="post">
            <input type="text" placeholder="What is your username?" name="username">
            <button>Sign in</button>
        </form>
    </div>
</template>

<!--<script>-->
<!--    export default {-->
<!--        name: "Test"-->
<!--    }-->
<!--</script>-->

<script>
    import axios from "axios";

    export default {
        data: function() {
            return {
                message: "Welcome to the test page!",
                myName: ""
            };
        },

        created: function() {
            axios.get("/brandon").then(response => {
                this.myName = response.data;
            });
        },
        // methods: {
        //     // createPost: function() {
        //     //     var params = {
        //     //         text: this.createText
        //     //     };
        //     //     console.log("creating post...")
        //     //     axios.post('/api/posts', params).then(
        //     //         response => {
        //     //             console.log(response);
        //     //         });
        //     //     location.reload();
        //     },
        // }
    }
</script>

<style scoped>

</style>