<template>
    <div class="test">
        <h1>This is a test page</h1>
        <h1>Text</h1>
        <h1>Message: {{message}}</h1>
        <h1>Name: {{myName}}</h1>
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
                message: "Welcome to Avert.relapse!",
                myName: ""
            };
        },

        created: function() {
            axios.get("/hello").then(response => {
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