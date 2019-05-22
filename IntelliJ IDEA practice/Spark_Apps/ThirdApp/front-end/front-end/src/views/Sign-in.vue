<template>
    <div class="sign-in">
        <h1>This is the sign-in page</h1>
    </div>
</template>

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

<style scoped>

</style>